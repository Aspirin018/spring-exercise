package chapter2.soundsystem2;


import java.util.List;

/**
 * Created by liyu on 2017/7/13.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }
//    public BlankDisc(String title){
//        this.title = title;
//    }

//    @Override
//    public void play() {
//        System.out.println("title:" + title);
//    }
    @Override
    public void play() {
        System.out.println("title:" + title + ", artist:" + artist);
        tracks.forEach(System.out::println);
    }

}
