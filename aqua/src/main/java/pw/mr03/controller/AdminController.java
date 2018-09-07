package pw.mr03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pw.mr03.api.Api;
import pw.mr03.api.ApiGenerator;
import pw.mr03.domain.request.ReqAdminAdd;
import pw.mr03.logic.AdminLogic;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminLogic adminLogic;

    @RequestMapping("/")
    public String index() {
        return "aqua admin ok again";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Api<String> add(@RequestBody @Validated ReqAdminAdd reqAdminAdd) {

        return ApiGenerator.ok();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Api get(HttpSession httpSession) {
        System.out.println(httpSession.getId());
        return adminLogic.get();
    }
}
