package chapter3.assemble.lunch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by liyu on 2017/7/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = LunchConfig.class)
public class LunchConfigTest {
    @Autowired
    private Lunch lunch;

    @Test
    public void lunchShouldNotBeNull(){
        assertNotNull(lunch);
    }
}
