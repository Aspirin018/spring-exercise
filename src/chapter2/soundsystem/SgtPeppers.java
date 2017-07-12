package chapter2.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by liyu on 2017/7/12.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.Pepper's lonely hearts club band";
    private String artist = "the beatles";
    @Override
    public void play() {
        System.out.println("title:" + title + "; artist:" + artist);
    }
}
