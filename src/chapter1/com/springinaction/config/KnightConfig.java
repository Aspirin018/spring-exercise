package chapter1.com.springinaction.config;

import chapter1.com.springinaction.knights.BraveKnight;
import chapter1.com.springinaction.knights.Knight;
import chapter1.com.springinaction.minstrel.Minstrel;
import chapter1.com.springinaction.quests.Quest;
import chapter1.com.springinaction.quests.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liyu on 2017/7/11.
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest(), minstrel());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    public Minstrel minstrel(){return new Minstrel(System.out);}

}
