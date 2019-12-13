package com.dubbo.springboot.sample.server.service;

import com.dubbo.springboot.sample.api.beans.User;

/**
 * @program: dubbo-springboot-sample
 * @description: 用户服务
 * @author: li_hd
 * @create: 2019-12-13 11:32
 **/
public interface UserService {

    User qryUserById(Integer id);

}
