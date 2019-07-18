package com.cibei.controller;

import com.cibei.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/17 16:43
 */
@RestController
@RequestMapping("/movie")
public class RibbonMovieController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Person queryById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://provider-user/person/{id}",Person.class,id);
    }
}
