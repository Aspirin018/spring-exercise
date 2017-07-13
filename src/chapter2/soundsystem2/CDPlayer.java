package chapter2.soundsystem2;

/**
 * Created by liyu on 2017/7/12.
 */
public class CDPlayer implements MediaPlayer{
    private CompactDisc cd;
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
