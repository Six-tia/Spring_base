package com.tiaedu.demo.service;

import com.tiaedu.demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {
    //开发绝大多数面向接口，因此为接口类型
    @Autowired
    @Qualifier("userServiceNormal")
    //@Resource
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }

}
