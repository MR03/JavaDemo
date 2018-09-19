package com.silvertb.service;

import com.silvertb.entity.User;
import com.silvertb.mapper.UserMapper;
import com.silvertb.utils.Common;
import com.silvertb.utils.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        User user = userMapper.findByPK(id);
        return user;
    }

    public Integer saveUser(User user) {
        // 检查是否已存在同手机号和邮箱的用户
        User guest = new User(user.getPhone(), user.getEmail());
        // 没有就添加
        if (userMapper.findByMobileOrEmail(guest).size() == 0) {
            user.setId(null);
            user.setPassword(Common.toMD5(user.getPassword()));
            user.setCreated(Time.dateToTimestamp());
            user.setUpdated(Time.dateToTimestamp());
            try {
                userMapper.save(user);
                return user.getId();
            } catch (Exception e) {
                e.printStackTrace();
                return -2;
            }
        }
        return -1;
    }
}
