package soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    public CDPlayer(){
        System.out.println("Constructor of CDPlayer Class without parameters.");
    }

    //1. 直接在变量依赖注入
   @Autowired(required=false)
    private compactDisc cd;
   @Autowired
    private Power power;

    //2. 在构造函数依赖注入
//    @Autowired
//    public CDPlayer(compactDisc cd){
//        this.cd = cd;
//        System.out.println("Constructor of CDPlayer Class with parameters.");
//    }

//    @Autowired
//    public CDPlayer(compactDisc cd, Power power) {
//        this.cd = cd;
//        this.power = power;
//    }

    //3. 在setter()函数依赖注入
//    @Autowired
//    public void setCd(compactDisc cd) {
//        this.cd = cd;
//        System.out.println("Setter of cd...");
//
//    }
//
//    @Autowired
//    public void setPower(Power power) {
//        this.power = power;
//        System.out.println("Setter of power...");
//    }

    //4. 在成员方法依赖注入
//    @Autowired
//    public void prepare(Power power, compactDisc cd) {
//        this.power = power;
//        this.cd = cd;
//        System.out.println("prepare method of CDPlayer...");
//    }

    public void player(){
        if(cd != null){
            cd.play();
        }
        power.supply();
    }

}
