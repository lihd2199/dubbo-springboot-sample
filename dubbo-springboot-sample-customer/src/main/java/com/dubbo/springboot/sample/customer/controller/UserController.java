package com.dubbo.springboot.sample.customer.controller;

import com.dubbo.springboot.sample.customer.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: dubbo-springboot-sample
 * @description: 用户信息
 * @author: li_hd
 * @create: 2019-12-13 14:25
 **/
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUserNameByUserId/{id}" ,method = RequestMethod.GET)
    public String getUserNameByUserId(@PathVariable(name = "id") final Integer id){

        return userService.getUserNameByUserId(id);

    }



}
