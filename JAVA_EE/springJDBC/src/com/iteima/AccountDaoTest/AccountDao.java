package com.iteima.AccountDaoTest;

import com.iteima.domain.Account;

/**
 * @ClassName AccountDao
 * @Description TODO
 * @Author tree
 * @Date 2019/3/20 15:11
 * @Version 1.8
 **/
public interface AccountDao {
    public int addAccount(Account account);
    public int updateAccount(Account account);
    public int deleteAccount(int id);
    public void transfer(String outUser,String inUser,Double money);
}
