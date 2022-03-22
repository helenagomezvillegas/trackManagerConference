public class TrackManager {

    private final TalkReader talkReader;

    public TrackManager(TalkReader talkReader) {
        this.talkReader = talkReader;
    }


    public Conference buildConference() {
        var talks = talkReader.obtainTalks();
        var conference = new Conference(talks);
        return conference;
    }
}
