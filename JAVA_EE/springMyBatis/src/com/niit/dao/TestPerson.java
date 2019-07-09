package com.niit.dao;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @ClassName TestPerson
 * @Description TODO
 * @Author tree
 * @Date 2019/4/8 10:34
 * @Version 1.8
 **/
public class TestPerson {
    private PersonDao personDao = new PersonDaoImpl();
    private final Logger logger = LoggerFactory.getLogger(TestPerson.class);

@Test
    public void getPersonInfById(){
       int id=2;
        Map map;
        try{
            map = personDao.getPersonInfById(id);
            logger.info("查询成功:"+map);
        }catch (Exception e){
            logger.error("查询失败"+e.getMessage());
        }
    }
    @Test
    public void getPersonInfById1(){
        int id=2;
        Map map;
        try {
            map = personDao.getPersonInfById1(id);
            logger.info("获取数据:"+map);
        }catch (Exception e){
            logger.error("获取数据失败:"+e.getMessage());
        }
    }
}
