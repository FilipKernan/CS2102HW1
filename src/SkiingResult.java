import java.util.LinkedList;

public class SkiingResult implements IEvent{
    LinkedList<Double> laps = new LinkedList<Double>();

    int finishPlace;
    int penalties;

    public SkiingResult(int finishPlace, double lapOne, double lapTwo, double lapThree, double lapFour, int penalties) {
        this.laps.add(lapOne);
        this.laps.add(lapTwo);
        this.laps.add(lapThree);
        this.laps.add(lapFour);
        this.finishPlace = finishPlace;
        this.penalties = penalties;
    }

    public double pointsEarned() {
        double sum = 0;
        for (Double lapTime: laps) {
            sum += lapTime;
        }
        return  sum;
    }
    public double getPenalties() {
        return 5 * penalties;
    }
}