package com.silvertb.controller;

import com.silvertb.api.Api;
import com.silvertb.api.ApiGenerator;
import com.silvertb.constant.CommonConstant;
import com.silvertb.domain.response.ResToken;
import com.silvertb.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = CommonConstant.API_PATH_V1 + "jwt")
public class JwtController {

    @Autowired
    UserLogic userLogic;

    @RequestMapping("")
    public Api<String> index() {
        return ApiGenerator.ok("jwt api running");
    }

    @GetMapping("/test")
    public Api<ResToken> test() {
        ResToken token = new ResToken("123123");
        return ApiGenerator.ok(token);
    }
}
