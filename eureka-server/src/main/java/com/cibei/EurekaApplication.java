package com.cibei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 15:51
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[]args){
        SpringApplication.run(EurekaApplication.class,args);
    }
}
