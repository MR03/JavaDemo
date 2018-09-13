package com.silvertb.controller;

import com.silvertb.api.Api;
import com.silvertb.api.ApiGenerator;
import com.silvertb.constant.CommonConstant;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = CommonConstant.API_PATH_V1 + "code")
public class CodeController {

    @RequestMapping("")
    public Api<String> index() {
        return ApiGenerator.ok("code api running");
    }
}
