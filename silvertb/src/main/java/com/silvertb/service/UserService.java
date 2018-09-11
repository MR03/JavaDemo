package com.silvertb.service;

import com.silvertb.entity.User;
import com.silvertb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        User user = userMapper.findByPK(id);
        return user;
    }

    public boolean saveUser(User user) {
        userMapper.save(user);
        return true;
    }
}
