package chapter3.assemble.injectwhenrun;

import chapter2.soundsystem2.BlankDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by liyu on 2017/7/19.
 */
@Configuration
@PropertySource("classpath:/chapter3/assemble/injectwhenrun/app.properties")
public class ExpressiveConfig {
    @Autowired
    Environment env;
    @Bean
    public BlankDisc blankDisc(){
        boolean titleExist = env.containsProperty("disc.title");
        boolean artistExist = env.containsProperty("disc.artist");
        if(titleExist && artistExist){
            return new BlankDisc(
                    env.getProperty("disc.title"),
                    env.getProperty("disc.artist")
            );
        }
        return null;
    }
}
