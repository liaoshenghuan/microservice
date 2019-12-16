package com.funtl.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 名称: com.funtl.hello.spring.cloud.web.admin.feign.WebAdminFeignApplication
 * 描述：feign方式创建服务消费者
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-16 11:22
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient//注册到Eureka服务上
public class WebAdminFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class,args);
    }
}
