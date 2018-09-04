package pw.mr03.oktalia.logic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pw.mr03.oktalia.api.Api;
import pw.mr03.oktalia.api.ApiFactory;
import pw.mr03.oktalia.logic.service.AdminService;
import pw.mr03.oktalia.request.RegisterAdminReq;

/**
 * Created by Administrator on 2017/12/22.
 */
@RestController
public class ReportController {

    @Autowired
    private AdminService adminService;

    /**
     * 注册-管理员
     */
    @RequestMapping(value="/oktalia/v1/report/accept", method=RequestMethod.POST)
    public Api reportAccept(@RequestBody @Validated RegisterAdminReq req) {
        int flag = adminService.addAdmin(req);
        if (flag == 1) {
            return ApiFactory.ok();
        }
        return ApiFactory.fail();
    }
}
