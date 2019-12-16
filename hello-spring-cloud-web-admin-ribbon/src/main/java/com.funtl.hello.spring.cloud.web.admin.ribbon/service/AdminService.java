package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 名称: AdminService
 * 描述：
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-08 19:46
 **/
@Service

public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fusingError")//使用注解指定熔断器方法
    public String sayHi(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message="+message,String.class);
    }

    public String fusingError(String message){//定义熔断方法，连不上了，就调用此方法
        return String.format("Hi your message is: %s but request bad",message);
    }


}
