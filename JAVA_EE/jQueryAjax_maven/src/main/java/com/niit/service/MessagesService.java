package com.niit.service;

import com.niit.entity.Messages;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MessagesService
 * @Description TODO
 * @Author tree
 * @Date 2019/6/5 16:13
 * @Version 1.8
 **/
public interface MessagesService {

    public int insertMessages(Messages messages);

    public Messages findMessagesById(Integer id);

    public ArrayList<Messages> getAllMessages();

}
