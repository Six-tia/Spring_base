package soundSystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-constructor.xml")
public class CDPlayerTest {

    //@Autowired
    //private CDPlayer cdplayer1;

    @Autowired
    private CDPlayer cdplayer3;

    @Test
    public void testPlay1(){
        //cdplayer1.play();
        //cdplayer2.play();
        cdplayer3.play();

    }

}
