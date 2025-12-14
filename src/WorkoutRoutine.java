public class WorkoutRoutine {
    private int push_up;
    private int squats;
    private int bench_press;

    public int totalReps() {
        return push_up + squats + bench_press;
    }

    public WorkoutRoutine(int push_up, int squats, int bench_press) {
        this.push_up = push_up;
        this.squats = squats;
        this.bench_press = bench_press;
    }

    public WorkoutRoutine() {

    }

    public int GetPush_up() {
        return push_up;
    }

    public void SetPush_up(int push_up) {
        this.push_up = push_up;
    }

    public int GetSquats() {
        return squats;
    }

    public void SetSquats(int squats) {
        this.squats = squats;
    }

    public int GetBench_press() {
        return bench_press;
    }

    public void SetBench_press(int bench_press) {
        this.bench_press = bench_press;
    }
}

    //    private String running_time;
//    private String yoga_time;
//    private String pilates_time;
    //    public WorkoutRoutine(String yoga_time, String pilates_time, String running_time) {
//        this.yoga_time = yoga_time;
//        this.pilates_time = pilates_time;
//        this.running_time = running_time;
//    }

//    public String GetYoga_time () {
//        return yoga_time;
//    }
//    public void SetYoga_time (String d) {
//        this.yoga_time = yoga_time;
//    }
//
//    public String GetPilates_time () {
//        return pilates_time;
//    }
//    public void SetPilates_time (String e) {
//        this.pilates_time = pilates_time;
//    }
//
//    public String GetRunning_time () {
//        return running_time;
//    }
//    public void SetRunning_time (String f) {
//        this.running_time = running_time;
//    }
