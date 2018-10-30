public class ShootingResult implements IEvent{
    ShootingRound[] rounds = new ShootingRound[4];

    public ShootingResult(ShootingRound[] rounds) {
        this.rounds = rounds;
    }

    public double pointsEarned() {
        int sum = 0;
        for (ShootingRound round :rounds) {
            sum = sum + round.numOfHits;
        }
        return sum;
    }


    public double getPenalties() {
        return (20 - pointsEarned()) * 60;
    }
}
