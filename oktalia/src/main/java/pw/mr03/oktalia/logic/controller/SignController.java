package pw.mr03.oktalia.logic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pw.mr03.oktalia.api.Api;
import pw.mr03.oktalia.api.ApiFactory;
import pw.mr03.oktalia.entity.Admin;
import pw.mr03.oktalia.request.SignInReq;
import pw.mr03.oktalia.logic.service.AdminService;

/**
 * Created by Administrator on 2017/12/22.
 */
@RestController
public class SignController {

    @Autowired
    private AdminService adminService;


    @RequestMapping(value="/oktalia/v1/sign/in", method=RequestMethod.POST)
    // @JsonView(Admin.SimpleView.class)
    public Api signIn(@RequestBody @Validated SignInReq req) {
        Admin admin = adminService.getAdmin(req.getMobile());
        if (admin == null) {
            return ApiFactory.fail("该号码没有注册");
        } else {
            // 登录密码是否正确
            boolean login = adminService.login(req, admin);
            if (login) {
                return ApiFactory.ok(admin);
            } else {
                return ApiFactory.fail("登录密码错误");
            }
        }
    }
}
