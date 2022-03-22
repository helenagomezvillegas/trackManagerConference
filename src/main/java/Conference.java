public class Conference {
    private final Talk[] talks;

    public Conference(Talk[] talks) {
        this.talks= talks;
    }

    public Talk[] obtainApprovedTalks() {
        return talks;
    }

    public Track[] createTracks() {
        Track track1 = new Track();
        var tracks = new Track[]{track1};
        return tracks;
    }
}
