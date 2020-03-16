package soundSystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-constructor.xml")
public class CompactDiscTest {

    @Autowired
    private compactDisc disc1;
    @Autowired
    private compactDisc disc2;
//    @Autowired
//    @Qualifier("disc6")
//    private compactDisc disc3;

    @Autowired
    @Qualifier("disc13")
    private compactDisc disc3;

    @Autowired
    @Qualifier("disc16")
    private compactDisc disc4;

    @Test
    public void test01(){
        disc1.play();
        disc2.play();
        //disc3.play();
    }

    @Test
    public void test02(){
        disc3.play();
    }

    @Test
    public void test03(){
        disc4.play();
    }

}
