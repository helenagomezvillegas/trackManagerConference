import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrackManagerTest {
    @Test
    public void trackManagerCreateConference(){
        var talkReader = new TalkReader();
        var trackManager = new TrackManager(talkReader);
        var conference=trackManager.buildConference();
        var talk1 = new Talk("Paolo teacher", 60);
        var talk2 = new Talk("Paolo teacher two", 30);
        var expectedTalks = new Talk[]{talk1, talk2};
        assertArrayEquals(expectedTalks, conference.obtainApprovedTalks());
    }

}
