package com.wangxin.multi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author:jzwx
 * @Desicription: Sb2scConfigApplication
 * @Date:Created in 2018-12-18 13:49
 * @Modified By:
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class Sb2scConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sb2scConfigApplication.class, args);
    }
}
