package pw.mr03.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/")
    public String index() {
        return "aqua order ok again";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestParam int id) {
        System.out.println(id);
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public void detail(@RequestParam int id) {
        System.out.println(id);
    }
}
