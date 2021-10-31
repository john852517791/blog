package com.wzyblog.service.Impl;/*
 *@Auther: wzy
 *@Date:2021/10/31 -10-31
 *@Descreption: com.wzyblog.service.Impl
 *@Version: 1.0
 */

import com.wzyblog.dao.UserRepository;
import com.wzyblog.entity.User;
import com.wzyblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String userName, String password) {
        return userRepository.findByUserNameAndPassword(userName, password);
    }
}
