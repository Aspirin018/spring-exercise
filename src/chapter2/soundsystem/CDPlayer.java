package chapter2.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by liyu on 2017/7/12.
 */
@Component
//@Named
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;
    @Autowired(required = false)
//    @Inject
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }
//    @Autowired
//    public void setCompactDisc(CompactDisc cd){
//        this.cd = cd;
//    }
//    @Autowired
//    public void insertDisc(CompactDisc cd){
//        this.cd = cd;
//    }
    @Override
    public void play() {
        cd.play();
    }
}
