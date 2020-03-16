package soundSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@ComponentScan
public class App {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.player();

    }

}
