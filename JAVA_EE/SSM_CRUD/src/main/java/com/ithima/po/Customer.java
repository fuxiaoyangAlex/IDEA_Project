package com.ithima.po;


/**
 * @ClassName Customer
 * @Description TODO
 * @Author tree
 * @Date 2019/5/26 0:08
 * @Version 1.8
 **/


public class Customer {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Integer id;
    private String username;
    private String jobs;
    private String phone;
}
