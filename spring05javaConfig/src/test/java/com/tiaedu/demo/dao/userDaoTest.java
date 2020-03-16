package com.tiaedu.demo.dao;

import com.tiaedu.demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class userDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testAdd(){
        userDao.add();
    }

}
