package chapter4.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by liyu on 2017/7/24.
 */
@Configuration
@EnableAspectJAutoProxy
public class ConcertConfig {
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
