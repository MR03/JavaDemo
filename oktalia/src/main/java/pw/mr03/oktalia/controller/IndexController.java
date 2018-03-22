package pw.mr03.oktalia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.mr03.oktalia.entity.Admin;
import pw.mr03.oktalia.service.AdminService;

import java.util.List;

/**
 * Created by Administrator on 2017/12/22.
 */
@RestController
public class IndexController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/")
    public List<Admin> index() {
        List<Admin> info = adminService.getById(1);
        return info;
    }
}
