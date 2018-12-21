package com.wangxin.multi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:jzwx
 * @Desicription: Sb2scEurekaApplication
 * @Date:Created in 2018-12-18 11:55
 * @Modified By:
 */
@EnableEurekaServer
@SpringBootApplication
public class Sb2scEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sb2scEurekaApplication.class, args);
    }

}
