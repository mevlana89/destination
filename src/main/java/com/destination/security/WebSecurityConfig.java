package com.destination.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin**").authenticated()
                .anyRequest().permitAll();
        http.formLogin();
        http.httpBasic();
        //Desactivation admin pour test
//                http
//                .authorizeRequests()
//                .anyRequest().permitAll();
//        http.formLogin();
//        http.httpBasic();
    }

}
