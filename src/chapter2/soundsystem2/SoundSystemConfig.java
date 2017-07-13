package chapter2.soundsystem2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by liyu on 2017/7/13.
 */
@Configuration
//@Import({CDConfig.class, CDPlayerConfig.class})
@Import(CDPlayerConfig.class)
@ImportResource("chapter2/soundsystem2/sound2.xml")
public class SoundSystemConfig {
}
