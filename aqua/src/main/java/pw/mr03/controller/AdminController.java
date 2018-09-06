package pw.mr03.controller;

import org.springframework.web.bind.annotation.*;
import pw.mr03.api.Api;
import pw.mr03.api.ApiGenerator;
import pw.mr03.domain.request.ReqAdminAdd;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/")
    public String index() {
        return "aqua admin ok again";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Api<String> add(@RequestBody ReqAdminAdd reqAdminAdd) {
        System.out.println(reqAdminAdd.getRealName());
        return ApiGenerator.ok();
    }
}
