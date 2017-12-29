package com.example.demo.service;

import com.example.demo.entity.Test;
import com.example.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public List<Test> getInfo(Integer id){
        return testMapper.getById(id);
    }
}
