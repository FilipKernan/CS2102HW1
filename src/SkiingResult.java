public class SkiingResult implements IEvent{
    double lapOne;
    double lapTwo;
    double lapThree;
    double lapFour;

    int finishPlace;
    int penalties;

    public double pointsEarned() {
        return lapOne + lapTwo + lapThree + lapFour;
    }
    public double getPenalties() {
        return 5 * penalties;
    }
}
