package com.cibei.persistence.dao;

import com.cibei.persistence.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 15:03
 */
public interface IPersonDao extends JpaRepository<Person,Long> {

}
