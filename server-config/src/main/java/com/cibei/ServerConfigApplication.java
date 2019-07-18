package com.cibei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 18:49
 */
@SpringBootApplication
@EnableConfigServer
public class ServerConfigApplication {
    public static void main(String[]args){
        SpringApplication.run(ServerConfigApplication.class,args);
    }
}
