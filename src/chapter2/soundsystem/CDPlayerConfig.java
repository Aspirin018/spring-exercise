package chapter2.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liyu on 2017/7/12.
 */
@Configuration
//@ComponentScan
//@ComponentScan("chapter2.soundsystem")
//@ComponentScan(basePackages = "chapter2.soundsystem")
//@ComponentScan(basePackages = {"chapter2.soundsystem", "chapter1.com.springinaction"})
@ComponentScan(basePackageClasses = {SgtPeppers.class})
public class CDPlayerConfig {

}
