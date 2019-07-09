package com.niit.dao;

import com.niit.domain.IdCard;
import com.niit.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @ClassName IdCardDaoImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/4/8 8:58
 * @Version 1.8
 **/
public class IdCardDaoImpl implements IdCardDao {
    SqlSession session;
    @Override
    public int insertIdCard(IdCard idCard) throws Exception {
        session= MyBatisUtil.getSession();
        int result=session.getMapper(IdCardDao.class).insertIdCard(idCard);
        session.commit();
        session.close();
        return result;
    }

    @Override
    public int deleteIdCard(Integer id) throws Exception {
        session=MyBatisUtil.getSession();
        int result = session.getMapper(IdCardDao.class).deleteIdCard(id);
        session.commit();
        session.close();
        return result;
    }

    @Override
    public int updateIdCard(IdCard idCard) throws Exception {
        session = MyBatisUtil.getSession();
        int result = session.getMapper(IdCardDao.class).updateIdCard(idCard);
        session.commit();
        session.close();
        return result;
    }

    @Override
    public IdCard getIdCardById(Integer id) throws Exception {
        session = MyBatisUtil.getSession();
        IdCard idCard = new IdCard();
        idCard = session.getMapper(IdCardDao.class).getIdCardById(id);
        session.commit();
        session.close();
        return idCard;
    }

    @Override
    public List<IdCard> getAllCard() throws Exception {
        session = MyBatisUtil.getSession();
        List<IdCard>idCardList = session.selectList("getAllIdCard");
        session.commit();
        session.close();
        return idCardList;
    }
}
