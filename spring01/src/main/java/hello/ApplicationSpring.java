package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationSpring {

    public static void main(String[] args){

//        MegPrinter printer = new MegPrinter();
//        MsgService service = new MsgService();
//        printer.getMessage(service);
//        printer.printMessage();
        //初始化spring容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        //基于注解的方式(@ComponentScan)初始化Spring容器，括号中放置applicationSpring.class

        //获取类
        MegPrinter printer = applicationContext.getBean(MegPrinter.class);
//        MsgService service = applicationContext.getBean(MsgService.class);
//
//        System.out.println(printer);
//        System.out.println(service);
//
//        printer.getMessage(service);
        printer.printMessage();

    }

}
