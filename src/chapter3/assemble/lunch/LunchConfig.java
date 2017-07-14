package chapter3.assemble.lunch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by liyu on 2017/7/14.
 */
@Configuration
@ComponentScan(basePackages = "chapter3.assemble.lunch")
public class LunchConfig {

    @Bean
    @Primary
    public Cake getCake(){
        return new Cake();
    }
}
