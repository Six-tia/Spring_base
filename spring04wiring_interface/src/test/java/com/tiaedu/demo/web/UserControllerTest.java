package com.tiaedu.demo.web;

import com.tiaedu.demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserControllerTest {

    //开发绝大多数面向接口，因此为接口类型
    @Autowired
    private UserController userController;

    @Test
    public void testAdd(){
        userController.add();
    }
}
