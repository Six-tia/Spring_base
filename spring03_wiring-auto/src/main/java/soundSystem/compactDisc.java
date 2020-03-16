package soundSystem;

import org.springframework.stereotype.Component;

@Component
public class compactDisc {

    public compactDisc(){
        System.out.println("Constructor of compactDisc Class without parameters.");
    }

    public void play(){
        System.out.println("the player is working...");
    }

}
