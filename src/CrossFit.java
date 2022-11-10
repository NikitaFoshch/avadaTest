public class CrossFit extends Training {
    int maxWeight;

    @Override
    public void consoleOutput() {
        System.out.println("Кроссфит тренировка! Длительность: "
                + getTrainingTime() + " минут. Максимальный вес штанги: "
                + getMaxWeight() + " кг. Киллокалорий: "
                + calorieExpenditure());
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
