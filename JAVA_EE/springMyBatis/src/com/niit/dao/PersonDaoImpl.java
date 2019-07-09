package com.niit.dao;

import com.niit.domain.Person;
import com.niit.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * @ClassName PersonDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/4/8 10:32
 * @Version 1.8
 **/
public class PersonDaoImpl implements PersonDao{
    SqlSession session;
    @Override
    public int insertPerson(Person person) throws Exception {
        return 0;
    }

    @Override
    public int deletePerson(Integer id) throws Exception {
        return 0;
    }

    @Override
    public int updatePerson(Person person) throws Exception {
        return 0;
    }

    @Override
    public Person getPersonById(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<Person> getAllPerson() throws Exception {
        return null;
    }

    @Override
    public Map getPersonInfById(Integer id) throws Exception {
        session = MyBatisUtil.getSession();
        Map map = session.getMapper(PersonDao.class).getPersonInfById(id);
        session.commit();
        session.close();
        return map;
    }

    @Override
    public Map getPersonInfById1(Integer id) throws Exception {
        session = MyBatisUtil.getSession();
        Map map = session.getMapper(PersonDao.class).getPersonInfById1(id);
        session.commit();
        session.close();
        return map;

    }
}
