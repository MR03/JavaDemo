package com.silvertb.controller;

import com.silvertb.api.Api;
import com.silvertb.api.ApiGenerator;
import com.silvertb.constant.CommonConstant;
import com.silvertb.domain.request.RequestUserSave;
import com.silvertb.domain.request.RequestUserSaveBatch;
import com.silvertb.entity.User;
import com.silvertb.logic.UserLogic;
import com.silvertb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/" + CommonConstant.PREFIX + "/" + CommonConstant.V1 + "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "user api running";
    }

    @GetMapping("/find")
    public Api<User> findUserById(@RequestParam int id) {
        User user = userService.findUserById(id);
        return ApiGenerator.ok(user);
    }

    @PostMapping("/save")
    public Api<String> save(@RequestBody @Validated RequestUserSave req) {
        User user = UserLogic.RequestToUserSave(req);
        userService.saveUser(user);
        return ApiGenerator.ok();
    }

    @PostMapping("/save/batch")
    public String saveBatch(@RequestBody RequestUserSaveBatch[] req) {
        System.out.println(req[0].getMobile());
        return "hello";
    }
}
