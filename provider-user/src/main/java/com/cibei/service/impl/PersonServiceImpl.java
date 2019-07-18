package com.cibei.service.impl;

import com.cibei.persistence.dao.IPersonDao;
import com.cibei.persistence.entity.Person;
import com.cibei.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 15:06
 */
@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    IPersonDao personDao;

    @Override
    public Optional<Person> queryById(Long id) {
        return personDao.findById(id);
    }

    @Override
    public List<Person> queryAll() {
        return personDao.findAll();
    }
}
