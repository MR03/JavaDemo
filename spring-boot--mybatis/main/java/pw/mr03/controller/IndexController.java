package pw.mr03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.mr03.entity.Test;
import pw.mr03.service.TestService;

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
        List<Test> info = testService.getById(4);
        return info;
    }
}
