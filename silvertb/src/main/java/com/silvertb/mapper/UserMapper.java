package com.silvertb.mapper;

import com.silvertb.design.BasicMapper;
import com.silvertb.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BasicMapper<User> {
    //
    public List<User> findByMobileOrEmail(User user); // 根据手机和邮箱
}
