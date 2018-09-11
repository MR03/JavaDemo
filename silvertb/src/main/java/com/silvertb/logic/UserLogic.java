package com.silvertb.logic;
import com.silvertb.domain.request.RequestUserSave;
import com.silvertb.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserLogic {
    public static User RequestToUserSave(RequestUserSave req) {
        User user = new User();
        BeanUtils.copyProperties(req, user);
        return user;
    }
}
