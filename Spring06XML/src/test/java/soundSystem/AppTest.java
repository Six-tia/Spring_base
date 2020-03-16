package soundSystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-property.xml")
public class AppTest {

    //private Music music1;
    //private Music music2;
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void test1(){
        cdPlayer.play();
    }
}
