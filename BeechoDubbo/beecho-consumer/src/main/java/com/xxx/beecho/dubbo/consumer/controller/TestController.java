package com.xxx.beecho.dubbo.consumer.controller;

import com.xxx.beecho.dubbo.api.BeechoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/9.
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private BeechoService beechoService;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        String str = beechoService.say("张春举");
        return str;
    }
}
