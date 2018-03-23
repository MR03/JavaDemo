package pw.mr03.oktalia.logic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pw.mr03.oktalia.logic.request.SignInReq;
import pw.mr03.oktalia.logic.service.AdminService;

/**
 * Created by Administrator on 2017/12/22.
 */
@RestController
public class SignController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value="/api/v1/sign/in", method=RequestMethod.POST)
    public String signIn(@RequestBody SignInReq signInReq) {
        if (signInReq.getRealname().equals("") || signInReq.getPassword().equals("")) {
            return "参数不能为空";
        } else {

        }
        System.out.println(signInReq.getRealname());
        return "sign in";
    }
}
