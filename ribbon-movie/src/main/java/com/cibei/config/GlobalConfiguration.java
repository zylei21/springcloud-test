package com.cibei.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/17 17:30
 */
@RibbonClients(defaultConfiguration = DefaultRibbonConfig.class)
public class GlobalConfiguration {
}
@Configuration
class DefaultRibbonConfig {
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}