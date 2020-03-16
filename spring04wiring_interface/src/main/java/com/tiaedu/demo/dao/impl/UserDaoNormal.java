package com.tiaedu.demo.dao.impl;

import com.tiaedu.demo.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class UserDaoNormal implements UserDao {

    public void add(){
        System.out.println("message is added into the database!");
    }

}
