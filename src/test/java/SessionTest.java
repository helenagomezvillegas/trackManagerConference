import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SessionTest {
    @Test
    public void addTalkIncreaseNumberOfTalksInsideTheSession() {
        var session = new Session();
        var talk = new Talk("Paolo", 60);
        session.addTalk(talk);
        assertEquals(1, session.obtainTalks().length);
    }
}
