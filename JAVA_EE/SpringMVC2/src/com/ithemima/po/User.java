package com.ithemima.po;

/**
 * @ClassName User
 * @Description TODO
 * @Author tree
 * @Date 2019/5/15 8:48
 * @Version 1.8
 **/
public class User {
    private Integer id;
    private String username;
    private String password;

    public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return  id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }

}
