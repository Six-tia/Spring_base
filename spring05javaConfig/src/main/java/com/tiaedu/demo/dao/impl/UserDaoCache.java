package com.tiaedu.demo.dao.impl;

import com.tiaedu.demo.dao.UserDao;

public class UserDaoCache implements UserDao {

    public void add(){
        System.out.println("A user is added to the cache...");
    }

}
