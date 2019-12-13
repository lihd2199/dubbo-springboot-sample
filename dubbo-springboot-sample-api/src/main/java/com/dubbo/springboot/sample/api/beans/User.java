package com.dubbo.springboot.sample.api.beans;

/**
 * @program: dubbo-springboot-sample
 * @description: 用户
 * @author: li_hd
 * @create: 2019-12-13 10:50
 **/
public class User {

    public User() {

    }

    public User(Integer id) {
        this.id = id;
    }

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
