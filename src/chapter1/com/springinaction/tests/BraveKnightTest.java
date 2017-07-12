package chapter1.com.springinaction.tests;

import static org.mockito.Mockito.*;

import chapter1.com.springinaction.knights.BraveKnight;
import chapter1.com.springinaction.quests.Quest;
import org.junit.Test;

/**
 * Created by liyu on 2017/7/11.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQust(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}
