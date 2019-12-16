package com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * 名称: AdminServiceHystrix
 * 描述：Hystrix（熔断器）方法
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-16 21:05
 **/
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is: %s but request bad",message);
    }
}
