package com.niit.service.impl;

import com.niit.dao.MessagesDao;
import com.niit.entity.Messages;
import com.niit.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * @ClassName MessagesServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/6/5 16:13
 * @Version 1.8
 **/

@Service
@Transactional
public class MessagesServiceImpl implements MessagesService {

    @Autowired
    private MessagesDao messagesDao;


    public int insertMessages(Messages messages) {
        return messagesDao.insertMessages(messages);
    }

    public Messages findMessagesById(Integer id){
        return messagesDao.findMessagesById(id);
    }

    public ArrayList<Messages> getAllMessages(){
        return  messagesDao.getAllMessages();
    }
}
