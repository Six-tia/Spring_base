package soundSystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//导入spring-test模块后，用以下两个注解可以更加优化
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置类
@ContextConfiguration(classes=AppConfig.class)
public class AppTest {
    //加上junit测试单元后，可以用此类来测试

    //@Autowired
    private CDPlayer cdPlayer;

    @Autowired
    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    @Test
    //App main()方法中的内容，因此App class可以删除
    public void testPlay(){

        //以下两行代码可以删除，因为加上了spring-test模块后，加上了RunWith和ContextConfiguration
        //两种注释，已经完成了下面两行的操作
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //CDPlayer cdPlayer = context.getBean(CDPlayer.class)
        cdPlayer.player();
    }

}
