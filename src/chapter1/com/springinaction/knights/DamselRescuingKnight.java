package chapter1.com.springinaction.knights;

import chapter1.com.springinaction.quests.RescueDamselQuest;

/**
 * Created by liyu on 2017/7/11.
 */
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
