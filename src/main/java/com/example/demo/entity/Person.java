package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @PackageName: com.example.demo.entity
 * @ClassName: Person
 * @Description: 实体
 * @Author: Raw
 * @Date: 2019/11/25 22:19
 */
@Setter
@Getter
@ToString
public class Person {
    private Integer id;

    private String name;
}
