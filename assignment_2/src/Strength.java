import java.util.Objects;

public class Strength extends Exercise {
    private int reps;

    public Strength(String name, int reps) {
        super(name);
        this.reps = reps;
    }

    // Getter & Setter
    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    @Override
    public String getDetails() {
        return "Strength: " + getName() + ", Reps: " + reps;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Strength)) return false;
        Strength s = (Strength) o;
        return reps == s.reps;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), reps);
    }
}
