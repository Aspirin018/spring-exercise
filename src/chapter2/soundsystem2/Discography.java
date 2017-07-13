package chapter2.soundsystem2;

import java.util.List;

/**
 * Created by liyu on 2017/7/13.
 */
public class Discography {
    private String artist;
    private List<CompactDisc> cds;
    public Discography(String artist, List<CompactDisc> cds){
        this.artist = artist;
        this.cds = cds;
    }
}
