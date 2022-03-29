import java.util.Objects;

public class Talk {
    private final String name;
    private final int time;

    public Talk(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Talk talk = (Talk) o;
        return time == talk.time && Objects.equals(name, talk.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time);
    }
}
