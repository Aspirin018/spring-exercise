package chapter1.com.springinaction.quests;

import java.io.PrintStream;

/**
 * Created by liyu on 2017/7/11.
 */
public class SlayDragonQuest implements Quest{
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }
    @Override
    public void embark(){
        stream.println("Embark on quest to slay the dragon");
    }
}
