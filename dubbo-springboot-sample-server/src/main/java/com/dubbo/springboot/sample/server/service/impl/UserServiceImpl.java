package com.dubbo.springboot.sample.server.service.impl;

import com.dubbo.springboot.sample.api.beans.User;
import com.dubbo.springboot.sample.server.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @program: dubbo-springboot-sample
 * @description: 用户服务实现类
 * @author: li_hd
 * @create: 2019-12-13 11:33
 **/
@Service
public class UserServiceImpl implements UserService {

    public User qryUserById(Integer id) {
        return new User(id,String.valueOf(id));
    }
}
