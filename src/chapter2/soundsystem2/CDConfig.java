package chapter2.soundsystem2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liyu on 2017/7/13.
 */
@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
