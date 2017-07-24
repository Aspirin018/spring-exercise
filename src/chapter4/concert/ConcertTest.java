package chapter4.concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by liyu on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = chapter4.concert.ConcertConfig.class)
public class ConcertTest {
    @Autowired
    private Audience audience;

    @Test
    public void audienceShouldNotBeNull(){
        assertNotNull(audience);
    }
}
