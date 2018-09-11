package com.silvertb.service;

import com.silvertb.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        System.out.println(userMapper.findByPK(18).getUsername());
    }

}
