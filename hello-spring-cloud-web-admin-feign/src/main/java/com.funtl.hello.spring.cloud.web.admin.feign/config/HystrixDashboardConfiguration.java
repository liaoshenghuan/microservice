package com.funtl.hello.spring.cloud.web.admin.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import io.micrometer.core.instrument.binder.hystrix.HystrixMetricsBinder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

/**
 * 名称: HystrixDashboardConfiguration
 * 描述：仪表盘Servlet配置
 *
 * @version v1.0
 * @author: lsh
 * @create: 2019-12-16 21:19
 **/
@Configuration
public class HystrixDashboardConfiguration {

    @Bean
    public ServletRegistrationBean getSerblet(){

        //因为没有配置web.xml去创建Servlet,框架提供了以下的方式

        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();//创建Servlet
        //SpringBoot提供的框架，用这个bean，把Servlet放进去
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);//设置启动顺序
        registrationBean.addUrlMappings("/hystrix.stream");//启动路径
        registrationBean.setName("HystrixMetricsStreamServlet");//相当web.xml中<name>的标签
        return registrationBean;
    }
}
