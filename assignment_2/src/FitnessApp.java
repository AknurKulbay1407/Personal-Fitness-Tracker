import java.util.Objects;

public class FitnessApp extends FitnessData {
    private int steps;
    private int heartRate;
    private int sleep; // hours

    public FitnessApp(int steps, int heartRate, int sleep) {
        this.steps = steps;
        this.heartRate = heartRate;
        this.sleep = sleep;
    }

    // Getters & Setters
    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    @Override
    public String getSummary() {
        return "Steps: " + steps + ", Heart rate: " + heartRate + ", Sleep: " + sleep;
    }

    @Override
    public String toString() {
        return getSummary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FitnessApp)) return false;
        FitnessApp that = (FitnessApp) o;
        return steps == that.steps &&
                heartRate == that.heartRate &&
                sleep == that.sleep;
    }

    @Override
    public int hashCode() {
        return Objects.hash(steps, heartRate, sleep);
    }
}
