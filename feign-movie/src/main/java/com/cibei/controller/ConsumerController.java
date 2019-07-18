package com.cibei.controller;

import com.cibei.consumer.MovieFeignClient;
import com.cibei.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 16:05
 */
@RestController
@RequestMapping("/movie")
@SuppressWarnings("all")
public class ConsumerController {

    @Autowired
    MovieFeignClient movieFeignClient;

    @GetMapping("/person/{id}")
    public Person queryById(@PathVariable("id")Long id){
        return movieFeignClient.queryById(id);
    }

}
