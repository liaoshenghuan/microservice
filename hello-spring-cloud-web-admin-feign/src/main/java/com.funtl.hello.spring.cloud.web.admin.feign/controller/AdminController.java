package com.funtl.hello.spring.cloud.web.admin.feign.controller;

/**
 * 名称: AdminController
 * 描述：
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-16 20:11
 **/
import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(String message){
        return adminService.sayHi(message);
    }
}
