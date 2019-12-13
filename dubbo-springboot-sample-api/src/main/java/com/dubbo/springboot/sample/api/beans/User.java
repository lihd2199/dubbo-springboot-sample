package com.dubbo.springboot.sample.api.beans;

import java.io.Serializable;

/**
 * @program: dubbo-springboot-sample
 * @description: 用户
 * @author: li_hd
 * @create: 2019-12-13 10:50
 **/
public class User implements Serializable {

    public User() {

    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
