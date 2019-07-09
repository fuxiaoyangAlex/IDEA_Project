package com.niit.domain;

import lombok.Data;

/**
 * @ClassName Person
 * @Description TODO
 * @Author tree
 * @Date 2019/4/8 8:35
 * @Version 1.8
 **/
@Data
public class Person {
    private Integer person_id;
    private String name;
    private Integer age;
    private String sex;
    private IdCard card_id;

}
