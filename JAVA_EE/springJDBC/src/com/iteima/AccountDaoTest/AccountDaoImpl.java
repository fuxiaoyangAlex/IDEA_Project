package com.iteima.AccountDaoTest;

import com.iteima.domain.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @ClassName AccountDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/3/20 15:14
 * @Version 1.8
 **/

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    //        声明JdbcTemplate属性及其setter方法
    private JdbcTemplate jdbcTemplate;

    @Resource(name = "jdbcTemplateSource")
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public int addAccount(Account account){
//        定义SQL
        String sql = "insert into account(username,balance)VALUES(?,?)";
//        定义数组来存储SQL语句中的参数
        Object[] args = new Object[]{
                account.getUsername(),
                account.getBalance()
        };
//        执行添加操作，返回的是受影响的行数
        int num = this.jdbcTemplate.update(sql, args);
        return num;
    }

    @Override
//    更新账户
    public int updateAccount(Account account) {
        String sql = "update account set username=?,balance=? where id=?";
        Object[] args = new Object[]{
                account.getUsername(),
                account.getBalance(),
                account.getId()
        };
        int num = this.jdbcTemplate.update(sql, args);
        return num;
    }

    @Override
    public int deleteAccount(int id) {
        String sql="delete from account where id=?";
        int num = jdbcTemplate.update(sql, id);
        return num;
    }

    /*转账事务*/
    @Override
    public void transfer(String outUser,String inUser,Double money) {
       this.jdbcTemplate.update("update account set balance = balance+?"
       +"where username=?",money,inUser);

       this.jdbcTemplate.update("update account set balance =balance-?"
       +"where username=?",money,outUser);
    }
}
