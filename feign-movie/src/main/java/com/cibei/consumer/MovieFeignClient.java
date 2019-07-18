package com.cibei.consumer;

import com.cibei.domain.Person;
import feign.Logger;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/17 17:43
 */
@FeignClient(name = "provider-user",configuration = MovieFeignConfig.class,fallbackFactory = MovieFeignFallbackFactory.class)
public interface MovieFeignClient {
    @GetMapping("/person/{id}")
    public Person queryById(@PathVariable Long id);
}
/**
 * NONE【性能最佳，适用于生产】：不记录任何日志（默认值）。
 * BASIC【适用于生产环境追踪问题】：仅记录请求方法、URL、响应状态代码以及执行时间。
 * HEADERS：记录BASIC级别的基础上，记录请求和响应的header。
 * FULL【比较适用于开发及测试环境定位问题】：记录请求和响应的header、body和元数据。
 * 配置类上也可添加@Configuraiton 注解，声明这是一个配置类；但此时千万别将该放置在主应用程序上下文@ComponentScan 所扫描的包中，否则，该配置将会被所有Feign Client共享（相当于变成了通用配置，其实本质还是Spring父子上下文扫描包重叠导致的问题），无法实现细粒度配置！
 * 个人建议：像我一样，不加@Configuration注解，省得进坑。
 *
 */
class MovieFeignConfig{
    @Bean
    public Logger.Level logger(){
        return Logger.Level.FULL;
    }
}
@Component
@Slf4j
class MovieFeignFallbackFactory implements FallbackFactory<MovieFeignClient>{

    @Override
    public MovieFeignClient create(Throwable throwable) {
        return new MovieFeignClient() {
            @Override
            public Person queryById(Long id) {
                log.error("进入回退逻辑", throwable);
                return new Person(id,"默认用户","默认",0);
            }
        };
    }
}