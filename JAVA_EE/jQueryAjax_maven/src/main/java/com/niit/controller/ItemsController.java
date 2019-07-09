package com.niit.controller;

import com.niit.entity.Items;
import com.niit.service.ItemsService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ItemsController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/24 8:32
 * @Version 1.8
 **/


@Controller
public class ItemsController {
//    将接口对象注入到本类中
   @Autowired
    private ItemsService itemsService;


//   此类相当于老师的DetailsJSON.java(servlet类)

    @RequestMapping("/getItemsById")
    public void findItemsById(HttpServletRequest request,HttpServletResponse response) throws Exception{
        int id = Integer.parseInt(request.getParameter("id"));
        Items items = itemsService.getItemsById(id);
        JSONObject jsonObject = new JSONObject();
        if(jsonObject!=null){
            jsonObject.put("id",items.getId());
            jsonObject.put("name",items.getName());
            jsonObject.put("city",items.getCity());
            jsonObject.put("price",items.getPrice());
            jsonObject.put("number",items.getNumber());
            jsonObject.put("picture",items.getPicture());
        }

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().println(jsonObject.toString());

        Cookie[] cookies = request.getCookies();

        String list="";
        if(cookies!=null&&cookies.length>0){
            for (Cookie c:cookies){
                if (c.getName().equals("ListViewCookies")){
                    list=c.getValue();
                }
            }
        }

        list += request.getParameter("id")+"#";
        String[] arr = list.split("#");
        //        当浏览记录大于1000时，清空List
        if(arr!=null&&arr.length>0){
             if(arr.length>1000){
                 list="";
             }
        }
        Cookie cookie = new Cookie("ListViewCookies",list);
        response.addCookie(cookie);

        JSONArray arrayJson = new JSONArray();
        ArrayList<Items> itemsList = itemsService.getViewList(list);
        if(itemsList!=null&&itemsList.size()>0){
            for(int i=0;i<itemsList.size();i++){
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("id",itemsList.get(i).getId());
                jsonObject1.put("name",itemsList.get(i).getName());
                jsonObject1.put("city",itemsList.get(3).getCity());
                jsonObject1.put("price",itemsList.get(4).getPrice());
                jsonObject1.put("number",itemsList.get(5).getNumber());
                jsonObject1.put("picture",itemsList.get(6).getPicture());
                arrayJson.add(jsonObject1);
            }
        }

    }
    @RequestMapping("/items")
    public String bb(){
        return "items";
    }

    @RequestMapping("/getAllItems")
    public String getAllItems(Model model){
        List<Items> items = itemsService.getAllItems();
        model.addAttribute("items",items);
        return "allItems";
    }

    @RequestMapping("/IndexJSON")
    public void itmeJson(HttpServletResponse response) throws Exception {
        List<Items> itmesList =itemsService.getAllItems();
        JSONArray array = new JSONArray();
        if(itmesList!=null&&itmesList.size()>0){
            for(int i=0;i<itmesList.size();i++){
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id",itmesList.get(i).getId());
                jsonObject.put("name",itmesList.get(i).getName());
                jsonObject.put("city",itmesList.get(i).getCity());
                jsonObject.put("price",itmesList.get(i).getPrice());
                jsonObject.put("number",itmesList.get(i).getNumber());
                jsonObject.put("picture",itmesList.get(i).getPicture());
                array.add(jsonObject);
            }

        }
        response.setContentType("text/json;charset=utf-8");
        //通过response对象打印到XHR对象，XHR在浏览器中可以看到
        response.getWriter().println(array.toString());
    }

    @RequestMapping("/show")
    public String aa(){
        return "show";
    }

}
