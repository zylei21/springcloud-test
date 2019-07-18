package com.cibei.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Demo class
 *
 * @author leishufeng
 * @date 2019/07/18 16:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String gender;
    private Integer age;
}
