import java.util.ArrayList;
import java.util.List;

public class Track {
    private  List<Talk> talkList = new ArrayList<>();
    public void addTalk(Talk talk) {
        talkList.add(talk);
    }

    public Talk[] obtainTalks() {
        Talk[] myArray = new Talk[talkList.size()];
        return talkList.toArray(myArray);
    }

    public boolean canAddTalk() {
        var sumTime = 0;
        for (int i = 0; i < talkList.size(); i++) {
            sumTime +=talkList.get(i).getTime();
        }
        if(sumTime >= 420){
            return false;
        }

        return true;
    }
}
