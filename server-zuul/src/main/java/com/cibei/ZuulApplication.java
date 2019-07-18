package com.cibei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 18:18
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[]args){
        SpringApplication.run(ZuulApplication.class,args);
    }
}
