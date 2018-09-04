package pw.mr03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/")
    public String index() {
        return "aqua order ok again";
    }

    @RequestMapping("/all")
    public String list() {
        return "aqua order ok again";
    }
}
