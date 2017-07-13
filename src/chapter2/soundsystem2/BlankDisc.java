package chapter2.soundsystem2;


/**
 * Created by liyu on 2017/7/13.
 */
public class BlankDisc implements CompactDisc {
    private String title;
//    private String artist;

//    public BlankDisc(String title, String artist){
//        this.title = title;
//        this.artist = artist;
//    }
    public BlankDisc(String title){
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("title:" + title);
    }
//    @Override
//    public void play() {
//        System.out.println("title:" + title + ", artist:" + artist);
//    }

}
