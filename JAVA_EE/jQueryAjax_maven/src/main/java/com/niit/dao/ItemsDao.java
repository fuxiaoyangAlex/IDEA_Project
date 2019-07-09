package com.niit.dao;

import com.niit.entity.Items;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassName ItemsDao
 * @Description TODO
 * @Author tree
 * @Date 2019/5/24 8:12
 * @Version 1.8
 **/

public interface ItemsDao {
    public Items getItemsById(Integer id);
    public List<Items> getAllItems();
    public ArrayList<Items> getViewList(String list);

}
