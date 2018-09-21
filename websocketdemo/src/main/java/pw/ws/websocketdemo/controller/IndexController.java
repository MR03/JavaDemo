package pw.ws.websocketdemo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RestController
public class IndexController {

    @RequestMapping("")
    public String index() {
        return "running";
    }

    //页面请求
    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid) {
        ModelAndView mav = new ModelAndView("/socket");
        mav.addObject("cid", cid);
        return mav;
    }

    //推送数据接口
//    @ResponseBody
//    @RequestMapping("/socket/push/{cid}")
//    public ApiReturnObject pushToWeb(@PathVariable String cid, String message) {
//        try {
//            WebSocketServer.sendInfo(message, cid);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return ApiReturnUtil.error(cid + "#" + e.getMessage());
//        }
//        return ApiReturnUtil.success(cid);
//    }
}
