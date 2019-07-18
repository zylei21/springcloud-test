package com.cibei.service;

import com.cibei.persistence.entity.Person;

import java.util.List;
import java.util.Optional;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 15:05
 */
public interface IPersonService {
    Optional<Person> queryById(Long id);
    List<Person> queryAll();
}
