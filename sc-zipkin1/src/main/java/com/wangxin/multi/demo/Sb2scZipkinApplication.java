package com.wangxin.multi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @Author:jzwx
 * @Desicription: Sb2scZipkinApplication
 * @Date:Created in 2018-12-19 17:19
 * @Modified By:
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class Sb2scZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(Sb2scZipkinApplication.class, args);
    }

}
