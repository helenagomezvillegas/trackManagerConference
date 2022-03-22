public class TalkReader {
    public Talk[] obtainTalks(){
        var talk1 = new Talk("Paolo teacher", 60);
        var talk2 = new Talk("Paolo teacher two", 30);
        return new Talk[]{talk1, talk2};

    }
}
