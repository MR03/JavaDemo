package com.silvertb.logic;
import com.silvertb.api.Api;
import com.silvertb.api.ApiGenerator;
import com.silvertb.domain.request.RequestUserSave;
import com.silvertb.entity.User;
import com.silvertb.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserLogic {

    @Autowired
    UserService userService;

    public Api<User> findUserById(int id) {
        User user = userService.findUserById(id);
        return ApiGenerator.ok(user);
    }

    public static User RequestToUserSave(RequestUserSave req) {
        User user = new User();
        BeanUtils.copyProperties(req, user);
        return user;
    }

    public Api<String> save(RequestUserSave req) {
        User user = UserLogic.RequestToUserSave(req);
        Integer result = userService.saveUser(user);
        if (result == -1) {
            return ApiGenerator.fail("该手机或邮箱已被注册");
        } else if (result == -2) {
            return ApiGenerator.fail("创建用户失败");
        } else {
            return ApiGenerator.ok(result.toString());
        }
    }

}
