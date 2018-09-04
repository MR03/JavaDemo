package pw.mr03.oktalia.logic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pw.mr03.oktalia.api.Api;
import pw.mr03.oktalia.api.ApiFactory;

/**
 * Created by Administrator on 2018/6/12.
 */
@RestController
public class ListController {

    /**
     * 列表
     */
    @RequestMapping(value="/oktalia/v1/order/list", method = RequestMethod.POST)
    public Api signIn() {
        return ApiFactory.ok();
    }
}
