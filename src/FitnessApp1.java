public class FitnessApp1 {
    private int steps;
    private int heart_rate;
    private int sleep;

    public FitnessApp1 (int steps, int heart, int sleep) {
        setSteps(steps);
        setHeart_rate(heart);
        setSleep(sleep);
    }
    public int getSteps () {
        return steps;
    }
    public void setSteps (int steps) {
        this.steps = steps;
    }
    public int getHeart_rate () {
        return heart_rate;
    }
    public void setHeart_rate (int heart) {
        this.heart_rate = heart;
    }
    public int getSleep () {
        return sleep;
    }
    public void setSleep (int sleep) {
        this.sleep = sleep;
    }
    public String health () {
        return "Step count: " + steps + "\n Heart rate: " + heart_rate + "\n slept hours: " + sleep;
    }
}
