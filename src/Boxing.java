public class Boxing extends Training {
    @Override
    public void consoleOutput() {
        System.out.println("Тренировка по боксу! Длительность: "
                + getTrainingTime() + " минут. Киллокалорий: "
                + calorieExpenditure());
    }
}
