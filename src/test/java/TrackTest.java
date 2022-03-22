import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrackTest {
    @Test
    public void addTalkIncreaseNumberOfTalksInsideTheTrack() {
        var track = new Track();
        var talk = new Talk("Paolo", 60);
        track.addTalk(talk);
        assertEquals(1, track.obtainTalks().length);
    }

}
