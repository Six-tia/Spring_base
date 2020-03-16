package com.tiaedu.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NotepadTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Notepad notepad1 = (Notepad)context.getBean("notepad");
        //Notepad notepad2 = (Notepad)context.getBean("notepad");
        //System.out.println(notepad1 == notepad2);
        //context.destroy();
        context.close();
    }

}
