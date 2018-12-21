package com.wangxin.multi.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.MediaType;
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
@Api("springcloud consumer ribbon 控制器")
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @ApiOperation(value = "根据内容发送消息",httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponse(code = 200, message = "success", response = Mono.class)
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

    /**
     * 通过服务id获取服务的地址
     * @return
     */
    @GetMapping("ribbon")
    public String ribbon(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("sc-provider");
        return serviceInstance.getUri().toString();
    }
}
