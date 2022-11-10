public class App {
    public static void main(String[] arg) {
        RunTraining runTraining1 = new RunTraining();
        runTraining1.setTrainingTime(60);
        runTraining1.setAveragePulse(140);
        runTraining1.setWeight(100);
        runTraining1.setDistance(10);

        RunTraining runTraining2 = new RunTraining();
        runTraining2.setTrainingTime(20);
        runTraining2.setAveragePulse(200);
        runTraining2.setWeight(90);
        runTraining2.setDistance(5);

        CrossFit crossFit = new CrossFit();
        crossFit.setTrainingTime(50);
        crossFit.setAveragePulse(160);
        crossFit.setWeight(86);
        crossFit.setMaxWeight(90);

        Boxing boxing = new Boxing();
        boxing.setTrainingTime(120);
        boxing.setAveragePulse(175);
        boxing.setWeight(75);

        Training[] trainings = {runTraining1, runTraining2, crossFit, boxing};
        for (Training training : trainings) {
            training.consoleOutput();
        }
    }
}
