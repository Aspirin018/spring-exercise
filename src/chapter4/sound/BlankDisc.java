package chapter4.sound;

import java.util.List;

/**
 * Created by liyu on 2017/7/24.
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    @Override
    public void playTrack(int i) {
        tracks.forEach(System.out::println);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
