public class Training {
    private float averagePulse;
    private int trainingTime;
    private float weight;

    public void consoleOutput() {
    }

    public float calorieExpenditure() {
        return 0.014f * getWeight() * getTrainingTime() * (0.12f * getAveragePulse() - 7f);
    }

    public float getAveragePulse() {
        return averagePulse;
    }

    public void setAveragePulse(float averagePulse) {
        this.averagePulse = averagePulse;
    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(int trainingTime) {
        this.trainingTime = trainingTime;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
