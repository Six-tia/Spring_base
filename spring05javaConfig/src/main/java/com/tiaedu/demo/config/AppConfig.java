package com.tiaedu.demo.config;

import com.tiaedu.demo.dao.UserDao;
import com.tiaedu.demo.dao.impl.UserDaoCache;
import com.tiaedu.demo.dao.impl.UserDaoNormal;
import com.tiaedu.demo.service.impl.UserServiceNormal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    //此注解表示被自动调用
    //@Bean("normal")
    //@Qualifier("normal")
    @Bean
    public UserDaoNormal userDaoNormal(){
        System.out.println("A new object of userDaoNormal is created....");
        return new UserDaoNormal();
    }

    @Bean("cache")
    //@Primary
    //@Qualifier("cache")
    public UserDaoCache userDaoCache(){
        System.out.println("A new object of userDaoCache is created....");
        return new UserDaoCache();
    }

    //创建新的userDao对象
//    @Bean
//    public UserServiceNormal userServiceNormal(){
//        UserDao userDao = userDaoNormal();
//        System.out.println("A new object of userServiceNormal is created....");
//        return new UserServiceNormal(userDao);
//    }

    //将userDao作为参数传入
//    @Bean
//    public UserServiceNormal userServiceNormal(UserDao userDao){
//        System.out.println("A new object of userServiceNormal is created....");
//        return new UserServiceNormal(userDao);
//    }

    //通过setter函数将userDao注入
    @Bean
    public UserServiceNormal userServiceNormal(@Qualifier("userDaoNormal") UserDao userDao){
        System.out.println("A new object of userServiceNormal is created....");
        UserServiceNormal userService = new UserServiceNormal();
        userService.setUserDao(userDao);
        return userService;
    }

}
