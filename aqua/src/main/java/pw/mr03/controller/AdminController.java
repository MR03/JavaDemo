package pw.mr03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pw.mr03.api.Api;
import pw.mr03.api.ApiGenerator;
import pw.mr03.domain.request.ReqAdminAdd;
import pw.mr03.entity.Admin;
import pw.mr03.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

//    @Autowired
//    private AdminService adminService;

    @RequestMapping("/")
    public String index() {
        return "aqua admin ok again";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Api<String> add(@RequestBody @Validated ReqAdminAdd reqAdminAdd) {
        return ApiGenerator.ok();
    }

//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    public Api<Admin> get() {
////        return ApiGenerator.ok(adminService.getAdmin());
//    }
}
