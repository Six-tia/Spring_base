package com.tiaedu.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Notepad3 {

    public Notepad3() {
        System.out.println("Constructor of Notepad3 without parameters..."+this.toString());
    }

    @PostConstruct
    public void init(){
        System.out.println("Init-method of Notepad3....");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy method of Notepad3....");
    }
}

