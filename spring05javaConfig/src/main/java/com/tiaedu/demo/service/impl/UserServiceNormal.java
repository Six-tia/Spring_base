package com.tiaedu.demo.service.impl;

import com.tiaedu.demo.dao.UserDao;
import com.tiaedu.demo.service.UserService;

public class UserServiceNormal implements UserService {

    private UserDao userDao;

    public UserServiceNormal() {
    }

    //通过构造函数进行依赖注入
    public UserServiceNormal(UserDao userDao) {
        this.userDao = userDao;
    }

    //通过setter方法进行依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("Service...");
        userDao.add();
    }

}
