package com.wangxin.multi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:jzwx
 * @Desicription: Sb2scProvider2Application
 * @Date:Created in 2018-12-21 10:22
 * @Modified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Sb2scProvider2Application {
    public static void main(String[] args) {
        SpringApplication.run(Sb2scProvider2Application.class, args);
    }

}
