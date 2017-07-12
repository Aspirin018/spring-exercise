package chapter1.com.springinaction.minstrel;

import java.io.PrintStream;

/**
 * Created by liyu on 2017/7/12.
 */
public class Minstrel {
    private PrintStream stream;
    public Minstrel(PrintStream stream){
        this.stream = stream;
    }
    public void singBeforeQuest(){
        stream.println("lalala, the knight is so brave");
    }
    public void singAfterQuest(){
        stream.println("hahaha, the brave knight did embark on a quest");
    }
}
