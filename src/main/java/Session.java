import com.google.common.cache.AbstractCache;

import java.util.ArrayList;
import java.util.List;

public class Session {
    private List<Talk> talkList = new ArrayList<>();

    public void addTalk(Talk talk) {
        talkList.add(talk);
    }

    public Talk[] obtainTalks() {
        Talk[] myArray = new Talk[talkList.size()];
        return talkList.toArray(myArray);
    }
}
