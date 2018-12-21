package com.wangxin.multi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:jzwx
 * @Desicription: Sb2scProviderApplication
 * @Date:Created in 2018-12-18 14:08
 * @Modified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Sb2scProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sb2scProviderApplication.class, args);
    }

}
