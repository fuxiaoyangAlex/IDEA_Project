package com.niit.dao;

import com.niit.entity.Messages;

import java.util.ArrayList;

/**
 * @ClassName MessagesDao
 * @Description TODO
 * @Author tree
 * @Date 2019/6/5 16:11
 * @Version 1.8
 **/
public interface MessagesDao {

    public int insertMessages(Messages messages);

    public Messages findMessagesById(Integer id);

    public ArrayList<Messages> getAllMessages();

}
