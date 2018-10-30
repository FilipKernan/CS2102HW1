public class Athlete {
    FinalResult result;


    boolean betterSkiier(Athlete competitor) {
        return this.result.skiingResult.pointsEarned() < competitor.result.skiingResult.pointsEarned();

    }

    public boolean betterShooter(Athlete otherAthlete){
        return this.result.shootingResult.pointsEarned() > otherAthlete.result.shootingResult.pointsEarned();

    }

    public boolean hasBeaten(Athlete competitor){
        return this.betterShooter(competitor) || this.betterSkiier(competitor);
    }
}
