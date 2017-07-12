package chapter2.soundsystem;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by liyu on 2017/7/12.
 */
@Component
//@Component("lonelyHeartsClub")
//@Named("lonelyHeartsClub")//需要引入javax.inject包
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.Pepper's lonely hearts club band";
    private String artist = "the beatles";
    @Override
    public void play() {
        System.out.println("title:" + title + "; artist:" + artist);
    }
}
