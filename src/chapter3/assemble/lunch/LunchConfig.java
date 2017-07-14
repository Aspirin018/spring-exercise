package chapter3.assemble.lunch;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

/**
 * Created by liyu on 2017/7/14.
 */
@Configuration
@ComponentScan(basePackages = "chapter3.assemble.lunch")
//@ImportResource("classpath:chapter3/assemble/lunch/lunch.xml") //将bean放在xml中时，需要import
public class LunchConfig {

//    @Bean
//    @Primary
//    public Cake getCake(){
//        return new Cake();
//    }
    @Bean
    @Qualifier("cold")
    public Dessert iceCream(){
        return new IceCream();
    }
}
