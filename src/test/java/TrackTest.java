import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrackTest {

    @Test
    public void addTalkIncreaseNumberOfTalksInsideTheTrack() {
        var track = new Track();
        var talk = new Talk("Paolo", 60);
        track.addTalk(talk);
        assertEquals(1, track.obtainTalks().length);
    }
    @Test
    public void canAddTalksReturnTrueIfTrackIsJustCreated(){
        //arrange
        var track = new Track();
        //act
        var addTalk= track.canAddTalk();
        //assert
        assertTrue(addTalk);

    }
    @Test
    public void canAddTalksReturnFalseIfTrackIsFull(){
        //arrange
        var track = new Track();
        var talk1 = new Talk("Paolo", 180);
        var talk2 = new Talk("Paolo", 120);
        var talk3 = new Talk("Paolo", 120);
        track.addTalk(talk1);
        track.addTalk(talk2);
        track.addTalk(talk3);
        //act
        var addTalk= track.canAddTalk();
        //assert
        assertFalse(addTalk);
    }
}
