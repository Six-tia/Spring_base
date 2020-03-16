package com.tiaedu.demo.config;

import com.tiaedu.demo.dao.impl.UserDaoNormal;
import com.tiaedu.demo.service.impl.UserServiceNormal;
import com.tiaedu.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.tiaedu.demo")
//@ComponentScan(basePackages = {"com.tiaedu.demo"})
//@ComponentScan(basePackages = {"com.tiaedu.demo.dao","com.tiaedu.demo.service","com.tiaedu.demo.web"})
@ComponentScan(basePackageClasses = {UserDaoNormal.class, UserServiceNormal.class, UserController.class})
public class AppConfig {
}
