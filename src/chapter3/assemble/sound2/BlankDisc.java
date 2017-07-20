package chapter3.assemble.sound2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by liyu on 2017/7/20.
 */
@Component
public class BlankDisc {
    private String title;
    private String artist;
    public BlankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist){
        this.title = title;
        this.artist = artist;
    }
}
