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
//    @Bean //Ĭ��bean id Ϊ������
////    @Bean(name="lonelyHeartsClubBand")
//    public CompactDisc sgtPeppers(){
//        return new SgtPeppers();
//    }

//    @Bean
//    public CDPlayer cdPlayer(){//Ĭ��bean�ǵ�����
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
//    public CDPlayer cdPlayer(CompactDisc cd){//����ʹ�õķ�ʽ
//        return new CDPlayer(cd);
//    }

//    @Bean
//    public CDPlayer cdPlayer(CompactDisc cd){
//        CDPlayer cdPlayer = new CDPlayer(cd);
//        cdPlayer.setCd(cd);
//        return cdPlayer;
//    }
}
