package com.funtl.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 名称: AdminController
 * 描述：服务提供者控制器
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-16 17:26
 **/
@RestController
public class AdminController {
    @Value("${server.port}")//自动注入端口
    private String port;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String message){//@RequestParam("message")
        return String.format("Hi your message is: %s port: %s ",message,port);
    }
}
