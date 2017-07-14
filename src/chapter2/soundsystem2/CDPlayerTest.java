package chapter2.soundsystem2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by liyu on 2017/7/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = chapter2.soundsystem.CDPlayerConfig.class)
public class CDPlayerTest {
    //    private CDPlayerConfig config = new CDPlayerConfig();
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();//需导入system-rules jar

//    @Test
//    public void play() {
//        config.cdPlayer().play();
//        assertEquals("title:Sgt.Pepper's lonely hearts club band; artist:the beatles\n", log.getLog());
//    }

//    @Test
//    public void play() {
//        ApplicationContext ctx =
//                new AnnotationConfigApplicationContext(SoundSystemConfig.class);
//        CDPlayer cdPlayer = ctx.getBean(CDPlayer.class);
//        CompactDisc cd = ctx.getBean(CompactDisc.class);
//        cdPlayer.play();
//        assertEquals("title:this is title, artist:this is artist\n" +
//                "this is first item\n" +
//                "this is second item\n" +
//                "this is third item\n", log.getLog());
//    }

//    @Test
//    public void play(){
//        //ClassPathXmlApplicationContext默认架子啊classpath下的配置文件，即web-inf/classes下的
//        ApplicationContext ctx = new ("chapter2/soundsystem2/sound2.xml");
//        CDPlayer cdPlayer = ctx.getBean(CDPlayer.class);
//        cdPlayer.play();
//        assertEquals("title:Sgt.Pepper's lonely hearts club band; artist:the beatles\n", log.getLog());
//    }

    @Test
    public void play(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter2/soundsystem2/rootConfig.xml");
        CDPlayer cdPlayer = ctx.getBean(CDPlayer.class);
        cdPlayer.play();
        assertEquals("title:Sgt.Pepper's lonely hearts club band; artist:the beatles\n", log.getLog());
    }
}