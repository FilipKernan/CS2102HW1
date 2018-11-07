import java.util.LinkedList;

public class ShootingResult implements IEvent{
        LinkedList<ShootingRound> numShootingRounds;


    public ShootingResult(ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4) {
        this.numShootingRounds = new LinkedList<>();
        this.numShootingRounds.add(round1);
        this.numShootingRounds.add(round2);
        this.numShootingRounds.add(round3);
        this.numShootingRounds.add(round4);

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


    public ShootingRound bestRoundByType(boolean isStanding){
        ShootingRound result = null;
        for (ShootingRound s: numShootingRounds) {
            if (s.isStanding == isStanding){
                if(!result.equals(null)){
                    if (result.numOfHits < s.numOfHits) {
                        result = s;
                    }
                }else{
                    result = s;
                }
            }
        }
        return result;
    }
}
