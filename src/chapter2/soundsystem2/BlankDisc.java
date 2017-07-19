package chapter2.soundsystem2;


import java.util.List;
import java.util.Set;

/**
 * Created by liyu on 2017/7/13.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
//    private Set tracks;
//    public BlankDisc(String title, String artist, Set tracks){
//        this.title = title;
//        this.artist = artist;
//        this.tracks = tracks;
//    }
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List tracks) {
        this.tracks = tracks;
    }
}
