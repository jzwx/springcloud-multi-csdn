package com.wangxin.multi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author:jzwx
 * @Desicription: Sb2scZuulApplication
 * @Date:Created in 2018-12-19 9:37
 * @Modified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
@RefreshScope
class Sb2scZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sb2scZuulApplication.class, args);
    }
}
