public class workoutRoutine1 {
    private String exercise;
    private int reps;
    private int duration;
    private String time;

    public workoutRoutine1 (String exercise, int reps, int duration, String time) {
        setExercise(exercise);
        setDuration(duration);
        setReps(reps);
        setTime(time);
    }

    public String workouts () {
        return "Name: " + exercise + "   reps: " + reps + "   duration: "
                + duration + " minutes" + "   time: " + time;
    }

    public String getExercise () {return exercise;}
    public void setExercise (String exercise) {this.exercise = exercise;}
    public int getReps () {return reps;}
    public void setReps (int reps) {this.reps = reps;}
    public int getDuration () {return duration;}
    public void setDuration (int duration) {this.duration = duration;}
    public String getTime () {return time;}
    public void setTime (String time) {this.time = time;}
}
