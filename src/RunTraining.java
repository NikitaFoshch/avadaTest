public class RunTraining extends Training {
    private float distance;

    @Override
    public void consoleOutput() {
        System.out.println("Беговая тренировка! Длительность: "
                + getTrainingTime() + " минут. Дистанция: "
                + getDistance() + " км. Киллокалорий: "
                + calorieExpenditure());
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
