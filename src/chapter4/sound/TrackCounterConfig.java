package chapter4.sound;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liyu on 2017/7/24.
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setTitle("this is title");
        cd.setArtist("this is artist");
        List<String> tracks = new ArrayList<String>();
        tracks.add("first track");
        tracks.add("second track");
        tracks.add("third track");
        tracks.add("fourth track");
        tracks.add("fifth track");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
