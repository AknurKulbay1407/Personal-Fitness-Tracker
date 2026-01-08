import java.util.Objects;

public class Cardio extends Exercise {
    private int duration; // minutes

    public Cardio(String name, int duration) {
        super(name);
        this.duration = duration;
    }

    // Getter & Setter
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Cardio: " + getName() + ", Duration: " + duration + " min";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Cardio)) return false;
        Cardio c = (Cardio) o;
        return duration == c.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }
}