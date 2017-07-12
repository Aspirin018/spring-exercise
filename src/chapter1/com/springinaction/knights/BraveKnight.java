package chapter1.com.springinaction.knights;

import chapter1.com.springinaction.minstrel.Minstrel;
import chapter1.com.springinaction.quests.Quest;

/**
 * Created by liyu on 2017/7/11.
 */
public class BraveKnight implements Knight {

    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel){//¹¹ÔìÆ÷×¢Èë
        this.minstrel = minstrel;
        this.quest = quest;
    }
    public void embarkOnQuest(){
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
