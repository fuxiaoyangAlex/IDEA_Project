package com.niit.controller;

import com.niit.entity.Messages;
import com.niit.service.MessagesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName MessagesController
 * @Description TODO
 * @Author tree
 * @Date 2019/6/5 16:14
 * @Version 1.8
 **/


@Controller
public class MessagesController {

    @Autowired
    private MessagesService messagesService;


    @RequestMapping("/insert.action")
    @ResponseBody
    public String insertMessages(@RequestBody Messages messages) {
        int i = messagesService.insertMessages(messages);
           if(i>0){
               return "OK";
           }else{
               return "FAIL";
           }
    }

    @RequestMapping("/findMessagesById")
    public Messages findMessagesById(Integer id) {
        Messages messages = messagesService.findMessagesById(id);
        return messages;
    }


    @RequestMapping("/getAllMessages")
    public String getAllMessage(Model model){
       ArrayList<Messages> listMessages = messagesService.getAllMessages();
        model.addAttribute("listMessages",listMessages);
        return "chat";
    }

    @RequestMapping("/toChat")
    public String toChat() {
        return "chat";
    }

}
