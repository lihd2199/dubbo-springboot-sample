package com.dubbo.springboot.sample.api.interfaces;

import com.dubbo.springboot.sample.api.beans.User;

/**
 * @program: dubbo-springboot-sample
 * @description: 用户服务
 * @author: li_hd
 * @create: 2019-12-13 10:51
 **/
public interface UserApi {


    User qryUserById(Integer id);




}
