package com.dubbo.springboot.sample.server.controller;

import com.dubbo.springboot.sample.api.beans.User;
import com.dubbo.springboot.sample.api.interfaces.UserApi;
import com.dubbo.springboot.sample.server.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @program: dubbo-springboot-sample
 * @description: 用户服务
 * @author: li_hd
 * @create: 2019-12-13 11:30
 **/
@Service(version = "${demo.service.version}")
public class UserController implements UserApi {

    @Resource
    private UserService userService;

    public User qryUserById(Integer id) {
            return userService.qryUserById(id);
    }
}
