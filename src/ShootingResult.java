import java.util.LinkedList;

public class ShootingResult implements IEvent{
        LinkedList<ShootingRound> numShootingRounds;
        boolean isStanding;

    public ShootingResult(ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4, boolean isStanding) {
        this.numShootingRounds = new LinkedList<>();
        this.numShootingRounds.add(round1);
        this.numShootingRounds.add(round2);
        this.numShootingRounds.add(round3);
        this.numShootingRounds.add(round4);
        this.isStanding = isStanding;
    }

    public double pointsEarned() {
        double sum = 0;
        for (ShootingRound round: numShootingRounds) {
            sum += round.numOfHits;
        }
        return  sum;
    }


    public double getPenalties() {
        return (20 - pointsEarned()) * 60;
    }
}
