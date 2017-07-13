package chapter2.soundsystem2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by liyu on 2017/7/12.
 */
@Configuration
//@Import(CDConfig.class)
public class CDPlayerConfig {
//    @Bean //默认bean id 为方法名
////    @Bean(name="lonelyHeartsClubBand")
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }

//    @Bean
//    public CDPlayer cdPlayer(){//默认bean是单例的
//        return new CDPlayer(sgtPeppers());
//    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }
//
//    @Bean
//    public CDPlayer anotherCDPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }

//    @Bean
//    public CDPlayer cdPlayer(CompactDisc cd){//建议使用的方式
//        return new CDPlayer(cd);
//    }

//    @Bean
//    public CDPlayer cdPlayer(CompactDisc cd){
//        CDPlayer cdPlayer = new CDPlayer(cd);
//        cdPlayer.setCd(cd);
//        return cdPlayer;
//    }
}
