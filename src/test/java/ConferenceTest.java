import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConferenceTest {
    @Test
    public void conferenceCreateTrack(){
        //Arrange
        var talk1 = new Talk("Paolo papasito", 60);
        var talk2 = new Talk("mamichula", 60);
        var talks = new Talk[]{talk1, talk2};
        var conference = new Conference(talks);
        // Act
        var tracks = conference.createTracks();
        // Assert
        assertEquals(1, tracks.length);
    }
}
