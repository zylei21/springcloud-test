package com.cibei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/19 9:49
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {
    public static void main(String[]args){
        SpringApplication.run(ConfigClientApplication.class,args);
    }

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String hello() {
        return this.profile;
    }
}
