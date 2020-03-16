package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {

    public static void main(String[] args){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //基于注解的方式(@ComponentScan)初始化Spring容器，括号中放置applicationSpring.class

        //获取类
        MegPrinter printer = applicationContext.getBean(MegPrinter.class);

        printer.printMessage();

    }

}
