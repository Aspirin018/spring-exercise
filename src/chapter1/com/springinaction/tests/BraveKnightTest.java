package chapter1.com.springinaction.tests;

import static org.mockito.Mockito.*;

import chapter1.com.springinaction.knights.BraveKnight;
import chapter1.com.springinaction.minstrel.Minstrel;
import chapter1.com.springinaction.quests.Quest;
import org.junit.Test;

/**
 * Created by liyu on 2017/7/11.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQust(){
        Quest mockQuest = mock(Quest.class);
//        Minstrel mockMinstrel = mock(Minstrel.class);
//        BraveKnight knight = new BraveKnight(mockQuest, mockMinstrel);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}
