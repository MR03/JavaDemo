package pw.mr03.oktalia.logic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pw.mr03.oktalia.api.Api;
import pw.mr03.oktalia.api.ApiFactory;
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
     * 注册-管理员
     */
    @RequestMapping(value="/oktalia/v1/register/admin", method=RequestMethod.POST)
    public Api signIn(@RequestBody @Validated RegisterAdminReq req, BindingResult result) {
        if(result.hasErrors())
        {
            String msg = result.getFieldError().getDefaultMessage();
            return ApiFactory.set(msg);
        }
        adminService.addAdmin(req);
        return ApiFactory.set();
    }
}
