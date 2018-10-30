public class Athlete {
    FinalResult result;

    boolean betterSkiier(Athlete competitor) {
        if (this.result.skiingResult.pointsEarned() > competitor.result.skiingResult.pointsEarned()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean betterShooter(Athlete otherAthlete){
        return this.result.shootingResult.pointsEarned() > otherAthlete.result.shootingResult.pointsEarned();

    }
}
