package com.wangxin.multi.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

/**
 * @Author:jzwx
 * @Desicription: RibbonController
 * @Date:Created in 2018-12-18 17:13
 * @Modified By:
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/ribbon/{wd}")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public Mono<String> sayHelloWorld(@PathVariable("wd") String parm) {
        String res = this.restTemplate.getForObject("http://sc-provider/test/" + parm, String.class);
        return Mono.just(res);
    }

  public Mono<String> fallbackMethod(@PathVariable("wd") String parm)
    {
        return Mono.just("fallback");
    }
}
