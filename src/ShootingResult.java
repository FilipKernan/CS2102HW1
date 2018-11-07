import java.util.LinkedList;

public class ShootingResult implements IEvent{
        LinkedList<ShootingRound> ShootingRounds;


    public ShootingResult(ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4) {
        this.ShootingRounds = new LinkedList<>();
        this.ShootingRounds.add(round1);
        this.ShootingRounds.add(round2);
        this.ShootingRounds.add(round3);
        this.ShootingRounds.add(round4);

    }

    public double pointsEarned() {
        double sum = 0;
        for (ShootingRound round: ShootingRounds) {
            sum += round.numOfHits;
        }
        return  sum;
    }


    public double getPenalties() {
        return (20 - pointsEarned()) * 60;
    }


    public ShootingRound bestRoundByType(boolean isStanding){
        ShootingRound result = null;
        for (ShootingRound s: ShootingRounds) {
            if (s.isStanding == isStanding){
                if(result != null){
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
