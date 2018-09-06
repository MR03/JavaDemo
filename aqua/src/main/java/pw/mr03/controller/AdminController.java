package pw.mr03.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pw.mr03.api.Api;
import pw.mr03.api.ApiGenerator;
import pw.mr03.domain.request.ReqAdminAdd;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/")
    public String index() {
        return "aqua admin ok again";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Api<String> add(@RequestBody @Validated ReqAdminAdd reqAdminAdd) {
        return ApiGenerator.ok();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Api<String> get() {
        return ApiGenerator.ok();
    }
}
