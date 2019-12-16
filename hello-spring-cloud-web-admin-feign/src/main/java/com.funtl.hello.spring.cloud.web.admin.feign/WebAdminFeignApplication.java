package com.funtl.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 名称: WebAdminFeignApplication
 * 描述：feign方式创建服务消费者
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-16 11:22
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient//注册到Eureka服务上
@EnableHystrixDashboard//此注解用于开启熔断器仪表盘功能。
/**
* 小知识：SpringBott2.X，使用仪表盘注解后，需要手动写个Servlet
*/
public class WebAdminFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class,args);
    }
}
