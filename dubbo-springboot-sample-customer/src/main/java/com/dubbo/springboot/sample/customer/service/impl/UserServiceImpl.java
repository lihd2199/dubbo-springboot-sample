package com.dubbo.springboot.sample.customer.service.impl;

import com.dubbo.springboot.sample.api.beans.User;
import com.dubbo.springboot.sample.api.interfaces.UserApi;
import com.dubbo.springboot.sample.customer.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @program: dubbo-springboot-sample
 * @description: 用户服务实现类
 * @author: li_hd
 * @create: 2019-12-13 11:33
 **/
@Service
public class UserServiceImpl implements UserService {


    @Reference
    private UserApi userApi;

    @Override
    public String getUserNameByUserId(final Integer id) {

        User user = userApi.qryUserById(id);

        return user.getName();

    }
}
