package com.funtl.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 名称: ServiceAdminApplication
 * 描述：服务消费者
 * 熔断器：在微服务架构中，根据业务来拆分成一个个的服务，服务与服务直接可以通过RPC相互调用，
 *          在SpringCloud中可以用RestTemplate + Ribbon 和 Feign 来调用，为了保证其高可用（N个9原则）
 *          单个服务通常使用集群部署，由于网络或自身原因（例如网络震荡），无法保证服务百分百可用，
 *          如果单个服务出现问题，调用这个服务就会出现线程阻塞，此时若大类的请求涌入，Servlet容器的线程资源会被消耗完毕。
 *          导致服务瘫痪，服务与服务直接的依赖性，故障会传播，会对整个微服务系统造成灾难性的严重后果，
 *          这就是服务故障的“雪崩”效应。
 *
 *          为了解决这个问题，提出了熔断器模型。
 *          Netflix 开源Hystrix组件，实现了熔断器模式，SpringCloud 对着一组件进行整合。在微服务架构中较底层的服务如果出现故障，
 *          会导致连锁故障。对特定的服务调用的不可用达到一个阈值（Hystrlx 是5秒20此）熔断器会被打开
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-02 22:43
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix//添加开启熔断器
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class,args);
    }
}
