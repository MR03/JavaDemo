package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/12/22.
 */
@RestController
public class IndexController {

    @Autowired
    private TestService testService;

    @RequestMapping("/")
    public List<Test> index() {
        List<Test> info = testService.getInfo(1);
        return info;
    }
}
