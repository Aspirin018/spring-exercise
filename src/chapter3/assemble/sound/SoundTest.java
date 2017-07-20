package chapter3.assemble.sound;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by liyu on 2017/7/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/chapter3/assemble/sound/sound.xml"})
public class SoundTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void discShouldNotBeNull(){
        BlankDisc blankDisc = (BlankDisc) context.getBean(BlankDisc.class);
        assertNotNull(blankDisc);
    }
}
