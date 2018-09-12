package com.silvertb.controller;

import com.silvertb.api.Api;
import com.silvertb.constant.CommonConstant;
import com.silvertb.domain.request.RequestUserSave;
import com.silvertb.domain.request.RequestUserSaveBatch;
import com.silvertb.entity.User;
import com.silvertb.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = CommonConstant.API_PATH_V1 + "user")
public class UserController {

    @Autowired
    UserLogic userLogic;

    @RequestMapping("/")
    public String index() {
        return "user api running";
    }

    @GetMapping("/find")
    public Api<User> findUserById(@RequestParam int id) {
        return userLogic.findUserById(id);
    }

    @PostMapping("/save")
    public Api<String> save(@RequestBody @Validated RequestUserSave req) {
        return userLogic.save(req);
    }

    @PostMapping("/save/batch")
    public String saveBatch(@RequestBody RequestUserSaveBatch[] req) {
        System.out.println(req[0].getMobile());
        return "hello";
    }
}
