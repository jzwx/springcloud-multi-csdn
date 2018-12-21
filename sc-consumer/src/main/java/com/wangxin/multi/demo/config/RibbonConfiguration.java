package com.wangxin.multi.demo.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:jzwx
 * @Desicription: RibbonConfiguration
 * @Date:Created in 2018-12-21 10:34
 * @Modified By:
 */
@Configuration
public class RibbonConfiguration {
    /**
     * 轮询
     * @return
     */
//    @Bean
//    public IPing ribbonPing() {
//        return new PingUrl();
//    }

    /**
     * 随机
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

    /**
     * 随机
     * @return
     */
//    @Bean
//    public ILoadBalancer ribbonLoadBalancer() {
//        return new ILoadBalancer();
//    }
}
