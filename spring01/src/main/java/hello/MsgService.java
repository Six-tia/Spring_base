package hello;

import org.springframework.stereotype.Component;

@Component
public class MsgService {

    public MsgService() {
        System.out.println("hello world spring!");
    }

    public String getMessage(){
        return "hello world!!!";
    }

}
