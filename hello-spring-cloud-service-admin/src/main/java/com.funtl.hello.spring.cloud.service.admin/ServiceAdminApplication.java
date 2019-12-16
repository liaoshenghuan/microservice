package com.funtl.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 名称: ServiceAdminApplication
 * 描述：服务提供者
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-02 22:43
 **/
@SpringBootApplication
@EnableEurekaClient
//@ServletComponentScan
//@ComponentScan(basePackages = {"com.funtl.hello.spring.cloud.service.admin"})//此注解用于请求不到控制层的接口，用于指定扫描包围着
public class ServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class,args);
    }
}
