package com.cibei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 17:58
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class FeignApplication {
    public static void main(String[]args){
        SpringApplication.run(FeignApplication.class,args);
    }
}
