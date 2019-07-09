package com.niit.daoImpl;

import com.niit.dao.UserDao;
import com.niit.domain.User;
import com.niit.mapper.UserRowMapper;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertUser(User user) {
        int n = 0;
        String sql = "insert into db_test(id,name,password)VALUES(null,?,?)";
        Object[] args = {user.getName(), user.getPassword()};
        n = jdbcTemplate.update(sql, args);
        return n;
    }

    @Override
    public int deleteById(Integer id) {
        int n = 0;
        String sql = "delete from db_test where id=?";
        Object[] args = {id};
        n = jdbcTemplate.update(sql, args);
        return n;
    }

    @Override
    public int updateUser(User user) {
        int n = 0;
        String sql = "update db_test set name=?,password=? where id=?";
        Object[] args = {user.getName(), user.getPassword(), user.getId()};
        n = jdbcTemplate.update(sql, args);
        return n;
    }

    @Override
    public List<User> getAllUser() {
        String sql = "select *from db_test";
        List<User> userList = jdbcTemplate.query(sql, new UserRowMapper());
        return userList;
    }

//    @Override
//    public User getUserById(Integer id) {
//
//    }

    @Override
    public List<User> getUserLike(String keywords) {
        String sql=" select * from db_test where name like " +
                "'%+keyword+%'";
        return jdbcTemplate.query(sql,new UserRowMapper());
    }

    @Override
    public void batchInsert(List<User> users) {
        List<User> userList = users;
        String sql = "insert into db_test VALUES(null,?,?)";

        jdbcTemplate.batchUpdate(sql,new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1,userList.get(i).getName());
                ps.setString(2,userList.get(i).getPassword());
            }

            @Override
            public int getBatchSize() {
                return userList.size();
            }
        });
    }
}
