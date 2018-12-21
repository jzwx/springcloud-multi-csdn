package com.wangxin.multi.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author:jzwx
 * @Desicription: WebSecurityConfig
 * @Date:Created in 2018-12-18 11:55
 * @Modified By:
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**","/turbine.stream");
        super.configure(http);
    }
}
