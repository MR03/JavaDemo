package pw.mr03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.mr03.entity.Test;
import pw.mr03.service.TestService;

@RestController
public class IndexController {

    @Autowired
    private TestService testService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/")
    public Test index() {
        Test list = testService.selectOrderCellById(1);
        stringRedisTemplate.opsForValue().set("name", "test redis");
        return list;
    }
}
