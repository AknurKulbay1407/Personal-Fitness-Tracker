import java.util.*;

public class WorkoutRoutine {
    private String routineName;
    private List<Exercise> exercises = new ArrayList<>();

    public WorkoutRoutine(String routineName) {
        this.routineName = routineName;
    }

    // Getter & Setter
    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public List<Exercise> getExercises() {
        return Collections.unmodifiableList(exercises);
    }

    public void addExercise(Exercise e) {
        exercises.add(e);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(routineName + ":\n");
        for (Exercise e : exercises) {
            sb.append(" - ").append(e.getDetails()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkoutRoutine)) return false;
        WorkoutRoutine that = (WorkoutRoutine) o;
        return Objects.equals(routineName, that.routineName) &&
                Objects.equals(exercises, that.exercises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routineName, exercises);
    }
}
