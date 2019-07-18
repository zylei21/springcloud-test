package com.cibei.controller;

import com.cibei.persistence.entity.Person;
import com.cibei.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 15:07
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    IPersonService personService;

    @GetMapping("/{id}")
    public Optional<Person> queryById(@PathVariable("id") Long id){
        return personService.queryById(id);
    }

    @GetMapping
    public List<Person> queryAll(){
        return personService.queryAll();
    }
}
