public class DisplayStudentMarksTest {
    public static void main(String[] args) {
        StudentMarksUpdater<PCMMarks> pcmMarksUpdater = new StudentMarksUpdater<>();

        PiChart<PCMMarks> piChart = new PiChart<>();
        SpreadSheet<PCMMarks> spreadSheet = new SpreadSheet<>();
        BarChart<PCMMarks> barChart = new BarChart<>();

        pcmMarksUpdater.addObserver(piChart);
        pcmMarksUpdater.addObserver(spreadSheet);
        pcmMarksUpdater.addObserver(barChart);

        pcmMarksUpdater.notifyObserver(new PCMMarks(50, 60, 70));
        pcmMarksUpdater.notifyObserver(new PCMMarks(70, 80, 90));
        pcmMarksUpdater.notifyObserver(new PCMMarks(50, 10, 100));
    }
}
