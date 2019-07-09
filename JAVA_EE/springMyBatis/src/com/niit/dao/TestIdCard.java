package com.niit.dao;

import com.niit.domain.IdCard;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @ClassName TestIdCard
 * @Description TODO
 * @Author tree
 * @Date 2019/4/8 9:26
 * @Version 1.8
 **/

public class TestIdCard {
    IdCardDao idCardDao = new IdCardDaoImpl();
    private final Logger logger = LoggerFactory.getLogger(TestIdCard.class);

    @Test
    public void insertIdCard() throws Exception{
        IdCard idCard = new IdCard();
        idCard.setCode("5552255522565155");
        int result;
        try{
          result=idCardDao.insertIdCard(idCard);
           logger.info("插入成功"+idCard);
        }catch (Exception e){
            logger.info("插入失败"+e.getMessage());
        }
    }
    @Test
    public void deleteIdCard()throws Exception{
        int result;
        try {
          result= idCardDao.deleteIdCard(6);
          logger.info("删除成功");
        }catch (Exception e){
            logger.error("插入失败"+e.getMessage());
        }
    }
    @Test
    public void updateIdCard()throws Exception{
        IdCard idCard = new IdCard();
        idCard.setCard_id(7);
        idCard.setCode("11111111111111");
        int result;
        try{
            result = idCardDao.updateIdCard(idCard);
            logger.info("修改成功"+idCard);
        }catch (Exception e){
            logger.error("修改失败"+e.getMessage());
        }
    }
    @Test
    public void getAllIdCard()throws Exception{
        List<IdCard> idCardList = idCardDao.getAllCard();
        try{
            for(IdCard idCard:idCardList){
                   System.out.println(idCard);
            }
            logger.info("查询成功");
        }catch (Exception e){
            logger.error("查询失败");
        }
    }

}
