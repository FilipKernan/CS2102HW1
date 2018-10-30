public class Athlete {
    FinalResult result;


    public boolean betterShooter(Athlete competitor){
        return this.result.shootingResult.pointsEarned() > competitor.result.shootingResult.pointsEarned();
    }


}
