package chapter3.assemble.injectwhenrun;

import chapter2.soundsystem.CDPlayerConfig;
import chapter2.soundsystem.MediaPlayer;
import chapter2.soundsystem2.BlankDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by liyu on 2017/7/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
@PropertySource("classpath:/chapter3/assemble/injectwhenrun/app.properties")
public class ExpressiveConfigTest {
//    @Autowired
//    private BlankDisc blankDisc;

//    @Test
//    public void cdShouldNotBeNull(){
//        assertNotNull(blankDisc);
//    }
    @Autowired
    Environment env;

    @Test(expected = IllegalStateException.class)
    public void discShouldThrowException(){
        new BlankDisc(
                env.getProperty("disc.title"),
                env.getRequiredProperty("disc.artist")
        );
    }
}
