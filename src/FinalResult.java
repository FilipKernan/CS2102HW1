public class FinalResult {
    ShootingResult shootingResult;
    SkiingResult skiingResult;

    double finalScore() {
        return skiingResult.pointsEarned() + skiingResult.getPenalties() + shootingResult.getPenalties();
    }
}
