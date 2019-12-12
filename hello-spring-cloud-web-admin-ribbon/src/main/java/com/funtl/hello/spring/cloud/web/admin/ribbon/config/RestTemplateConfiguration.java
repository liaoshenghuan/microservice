package com.funtl.hello.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 名称: RestTemplateConfiguration
 * 描述：ribbon模式提供消费者()
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-08 19:27
 **/
@Configuration//此注解用于类似创建了一个配置config.xml文件
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced//用来加载负载均衡用的，做服务集群
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
