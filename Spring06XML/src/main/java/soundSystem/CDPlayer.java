package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer {

    public CDPlayer(){

        System.out.println("Constructor of CDPlayer Class without parameters." + this.toString());

    }

    private compactDisc cd;
    private compactDisc cd1;

    public compactDisc getCd() {
        return cd;
    }

    public void setCd(compactDisc cd) {
        this.cd = cd;
        System.out.println("set the value of cd: " + cd + this.toString() );

    }

    public compactDisc getCd1() {
        return cd1;
    }

    public void setCd1(compactDisc cd1) {
        this.cd1 = cd1;
        System.out.println("set the value of cd1: " + cd1 + this.toString() );

    }

    public CDPlayer(compactDisc cd, compactDisc cd1){
       this.cd = cd;
       this.cd1 = cd1;
       System.out.println("Constructor of CDPlayer Class with parameters." + this.toString());
    }

    public void play(){

        System.out.println("play...."+this.toString());
        cd.play();
        //cd1.play();

    }

}
