public class SkiingResult implements IEvent{
    double lapOne;
    double lapTwo;
    double lapThree;
    double lapFour;

    int finishPlace;
    int penalties;

    public SkiingResult(int finishPlace, double lapOne, double lapTwo, double lapThree, double lapFour, int penalties) {
        this.lapOne = lapOne;
        this.lapTwo = lapTwo;
        this.lapThree = lapThree;
        this.lapFour = lapFour;
        this.finishPlace = finishPlace;
        this.penalties = penalties;
    }

    public double pointsEarned() {
        return lapOne + lapTwo + lapThree + lapFour;
    }
    public double getPenalties() {
        return 5 * penalties;
    }
}