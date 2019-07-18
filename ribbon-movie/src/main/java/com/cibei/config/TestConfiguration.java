package com.cibei.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/17 17:14
 * * 使用RibbonClient，为特定的目标服务自定义配置。
 *  * 使用@RibbonClient的configuration属性，指定Ribbon的配置类。
 *  * 可参考的示例：
 *  * http://spring.io/guides/gs/client-side-load-balancing/
 */
//@RibbonClient(name = "provider-user",configuration = RibbonConfiguration.class)
@Configuration
public class TestConfiguration {

}
/**
 *
 * 该类为Ribbon的配置类
         *  * 注意：该类不能放在主应用程序上下文@ComponentScan所扫描的包中，否则配置将会被所有Ribbon Client共享。
        */
//@Configuration
//class RibbonConfiguration {
//    @Bean
//    public IRule ribbonRule(){
//        //由负载均衡改为随机
//        return new RandomRule();
//    }
//}
