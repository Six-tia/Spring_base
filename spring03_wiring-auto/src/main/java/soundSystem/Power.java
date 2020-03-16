package soundSystem;

import org.springframework.stereotype.Component;

@Component
public class Power {

    public Power() {

        System.out.println("Constructor of Power Class without parameters.");

    }

    public void supply(){

        System.out.println("the power is being supplied.....");

    }

}
