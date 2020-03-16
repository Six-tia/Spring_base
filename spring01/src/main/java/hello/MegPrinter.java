package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MegPrinter {

    public MegPrinter() {
        System.out.println("MsgPrinter...");
    }

    private MsgService msgService;

    @Autowired
    public void getMessage(MsgService service){
        msgService = service;
    }

    public void printMessage(){
        System.out.println(msgService.getMessage());
    }

}
