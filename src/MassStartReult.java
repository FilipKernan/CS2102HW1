import java.util.LinkedList;

public class MassStartReult implements IEvent {
    int startingPosition;
    int finishingPosition;
    LinkedList<Double> laps;
    int penalties;

    public MassStartReult(int startingPosition, int finishingPosition, double lapOne, double lapTwo, double lapThree, double lapFour, int penalties) {
        this.finishingPosition = finishingPosition;
        this.laps.add(lapOne);
        this.laps.add(lapTwo);
        this.laps.add(lapThree);
        this.laps.add(lapFour);
        this.penalties = penalties;
        this.startingPosition = startingPosition;
    }

    @Override
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
