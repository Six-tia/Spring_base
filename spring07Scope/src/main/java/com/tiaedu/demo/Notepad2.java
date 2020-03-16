package com.tiaedu.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//singleton为默认值
//@Scope("prototype")
//@Scope("singleton")
//@Scope(scopeName="prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy //延迟加载只有在singleton模式下才起作用，prototype自动按需加载
public class Notepad2 {

    public Notepad2() {
        System.out.println("Constructor of Notepad2 without parameters..."+this.toString());
    }

    @PostConstruct
    public void init(){
        System.out.println("Init-method of Notepad2....");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method of Notepad2....");
    }

}
