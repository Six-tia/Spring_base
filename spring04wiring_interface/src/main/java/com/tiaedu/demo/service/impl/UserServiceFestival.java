package com.tiaedu.demo.service.impl;

import com.tiaedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fes")
@Primary
@Qualifier("festival")
public class UserServiceFestival implements UserService {

    public void add(){
        System.out.println("add a user and send a discount coupon!");
    }

}
