package com.tiaedu.demo.service.impl;

import com.tiaedu.demo.dao.UserDao;
import com.tiaedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@Qualifier("normal")
public class UserServiceNormal implements UserService {

    @Autowired
    private UserDao userDao;

    public void add(){
        userDao.add();
        System.out.println("add a user!");
    }

}
