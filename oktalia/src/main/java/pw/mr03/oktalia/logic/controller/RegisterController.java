package pw.mr03.oktalia.logic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pw.mr03.oktalia.request.RegisterAdminReq;
import pw.mr03.oktalia.logic.service.AdminService;

/**
 * Created by Administrator on 2017/12/22.
 */
@RestController
public class RegisterController {

    @Autowired
    private AdminService adminService;

    /**
     * 管理员注册
     */
    @RequestMapping(value="/api/v1/register/admin", method=RequestMethod.POST)
    public String signIn(@RequestBody RegisterAdminReq req) {
        if (req.getRealname().equals("") || req.getPwd().equals("") || req.getMobile().equals("")) {
            return "参数不能为空";
        }
        adminService.addAdmin(req);
        return "sign in";
    }
}
