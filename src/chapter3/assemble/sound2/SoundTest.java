package chapter3.assemble.sound2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by liyu on 2017/7/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundConfig.class)
public class SoundTest {
    @Autowired
    private BlankDisc blankDisc;
    @Test
    public void blankDiscShouldNotBeNull(){
        assertNotNull(blankDisc);
    }
}
