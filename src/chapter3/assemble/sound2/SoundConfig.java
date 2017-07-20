package chapter3.assemble.sound2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.PropertySources;

/**
 * Created by liyu on 2017/7/20.
 */
@Configuration
@ComponentScan(basePackages = "chapter3.assemble.sound2")
@PropertySource("classpath:/chapter3/assemble/sound2/app.properties")
public class SoundConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
