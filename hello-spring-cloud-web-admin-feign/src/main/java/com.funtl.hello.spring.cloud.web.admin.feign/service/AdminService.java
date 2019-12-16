package com.funtl.hello.spring.cloud.web.admin.feign.service;

import com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 名称: AdminService
 * 描述：feign方式创建服务消费者，业务接口，此方式有集成了ribbon,默认集成集群
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-16 20:05
 **/
@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)//服务提供者的名字,fallback--失败回退类
public interface AdminService {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
