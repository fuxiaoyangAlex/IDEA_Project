package com.niit.dao;

import com.niit.domain.IdCard;

import java.util.List;

/**
 * @ClassName IdCardDao
 * @Description TODO
 * @Author tree
 * @Date 2019/4/8 8:51
 * @Version 1.8
 **/
public interface IdCardDao {
    int insertIdCard(IdCard idCard) throws Exception;
    int deleteIdCard(Integer id) throws Exception;
    int updateIdCard(IdCard idCard) throws Exception;
//        查询
    IdCard getIdCardById(Integer id)throws Exception;
    List<IdCard> getAllCard() throws  Exception;
}
