package com.niit.service.impl;

import com.niit.dao.ItemsDao;
import com.niit.entity.Items;
import com.niit.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ItemsServiceImpl
 * @Description TODO
 * @Author tree
 * @Date 2019/5/24 8:51
 * @Version 1.8
 **/

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
   private ItemsDao itemsDao;


    @Override
    public Items getItemsById(Integer id) {
        return itemsDao.getItemsById(id);
    }

    public List<Items> getAllItems(){
        return this.itemsDao.getAllItems();
    }

    public ArrayList<Items> getViewList(String list){
        return  this.itemsDao.getViewList(list);
    }
}
