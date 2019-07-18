package com.cibei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 16:04
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
