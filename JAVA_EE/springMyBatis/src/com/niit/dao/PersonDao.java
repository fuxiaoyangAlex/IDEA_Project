package com.niit.dao;

import com.niit.domain.Person;

import java.util.List;
import java.util.Map;

/**
 * @ClassName PersonDao
 * @Description TODO
 * @Author tree
 * @Date 2019/4/8 8:55
 * @Version 1.8
 **/
public interface PersonDao {
    int insertPerson(Person person)throws Exception;
    int deletePerson(Integer id)throws  Exception;
    int updatePerson(Person person)throws Exception;
    Person getPersonById(Integer id)throws Exception;
    List<Person> getAllPerson()throws Exception;

    Map getPersonInfById(Integer id)throws Exception; //使用嵌套查询 实现
    Map getPersonInfById1(Integer id)throws Exception;//使用嵌套结果 实现
}
