package com.silvertb.service;

import com.silvertb.entity.User;
import com.silvertb.mapper.UserMapper;
import com.silvertb.utils.Common;
import com.silvertb.utils.Time;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    public void saveUserTest() {
        User user = new User(null, "test2", Common.toMD5("sdfsdf"), "1500526845", "fws1ef@qq.com", Time.dateToTimestamp(), Time.dateToTimestamp());
        System.out.println(userService.saveUser(user));
    }
}
