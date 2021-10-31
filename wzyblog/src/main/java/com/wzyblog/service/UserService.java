package com.wzyblog.service;/*
 *@Auther: wzy
 *@Date:2021/10/31 -10-31
 *@Descreption: com.wzyblog.service
 *@Version: 1.0
 */

import com.wzyblog.entity.User;

public interface UserService {

//    验证用户登录
    User checkUser(String userName, String password);
}
