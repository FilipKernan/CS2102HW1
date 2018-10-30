public class FinalResult {
    ShootingResult shootingResult;
    SkiingResult skiingResult;

    double finalScore() {
        int placeMod = 0;
        if (skiingResult.finishPlace == 1) {
            placeMod = 10;
        } else if (skiingResult.finishPlace == 2) {
            placeMod = 7;
        } else if (skiingResult.finishPlace == 3) {
            placeMod = 3;
        } else if (skiingResult.finishPlace == 4) {
            placeMod = 1;
        }
        return skiingResult.pointsEarned() + skiingResult.getPenalties() + shootingResult.getPenalties() - placeMod;
    }
}
