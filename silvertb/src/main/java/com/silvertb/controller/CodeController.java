package com.silvertb.controller;

import com.silvertb.api.Api;
import com.silvertb.api.ApiGenerator;
import com.silvertb.constant.CommonConstant;
import com.silvertb.logic.CodeLogic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = CommonConstant.API_PATH_V1 + "code")
public class CodeController {

    @RequestMapping("")
    public Api<String> index() {
        return ApiGenerator.ok("code api running");
    }

    @GetMapping("/send")
    public Api<String> send() {
        CodeLogic.sendCode();
        return ApiGenerator.ok();
    }
}
