package chapter2.soundsystem2;

/**
 * Created by liyu on 2017/7/12.
 */
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.Pepper's lonely hearts club band";
    private String artist = "the beatles";
    @Override
    public void play() {
        System.out.println("title:" + title + "; artist:" + artist);
    }
}
