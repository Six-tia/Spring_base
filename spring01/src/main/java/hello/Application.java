package hello;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

    public static void main(String[] args){

        MegPrinter printer = new MegPrinter();
        MsgService service = new MsgService();
        printer.getMessage(service);
        printer.printMessage();


    }

}
