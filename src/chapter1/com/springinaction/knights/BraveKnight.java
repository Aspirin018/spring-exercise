package chapter1.com.springinaction.knights;

import chapter1.com.springinaction.quests.Quest;

/**
 * Created by liyu on 2017/7/11.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){//¹¹ÔìÆ÷×¢Èë
        this.quest = quest;
    }
    public void embarkOnQuest(){
        quest.embark();
    }
}
