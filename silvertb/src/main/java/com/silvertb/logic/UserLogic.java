package com.silvertb.logic;
import com.silvertb.api.Api;
import com.silvertb.api.ApiGenerator;
import com.silvertb.api.Code;
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
            return ApiGenerator.fail(Code.FAILURE_HAS_USER.getMsg());
        } else if (result == -2) {
            return ApiGenerator.fail(Code.FAILURE_DB_ACTION.getMsg());
        } else {
            return ApiGenerator.ok(result.toString());
        }
    }

}
