package soundSystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("Application Spring is running.....");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
        //compactDisc disc = classPathXmlApplicationContext.getBean(compactDisc.class);
        compactDisc disc = (compactDisc) classPathXmlApplicationContext.getBean("disc4");
        compactDisc disc1 = (compactDisc) classPathXmlApplicationContext.getBean("disc5");
        disc.play();
        disc1.play();

    }

}
