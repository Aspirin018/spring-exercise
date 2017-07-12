package chapter1.com.springinaction.main;

import chapter1.com.springinaction.knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liyu on 2017/7/11.
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
