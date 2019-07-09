package com.niit.service;


import com.niit.entity.Items;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName ItemsService
 * @Description TODO
 * @Author tree
 * @Date 2019/5/24 8:48
 * @Version 1.8
 **/
public interface ItemsService {
    public Items getItemsById(Integer id);
    public List<Items> getAllItems();
    public ArrayList<Items> getViewList(String list);
}
