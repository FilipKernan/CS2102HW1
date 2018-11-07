
import java.util.LinkedList;

public class Competition {
    int numShootingRounds;
    LinkedList<Athlete> listOfAthletes;

    public Competition(int numShootingRounds, LinkedList<Athlete> randomAthlete) {
        this.numShootingRounds = numShootingRounds;
        this.listOfAthletes = randomAthlete;
    }

    public LinkedList<String> shootingDNF() {
        LinkedList<String> didNotFinish = new LinkedList<>();
        for (Athlete thisGuy: listOfAthletes) {
            if (thisGuy.result.shootingResult.ShootingRounds.size() != this.numShootingRounds) {
                didNotFinish.add(thisGuy.athleteName);
            }
        }
        return didNotFinish;
    }

    public double finalScoreForAthlete(String aName) {
        FinalResult eliFuckinSucks= null;
        for (Athlete thisGuy: listOfAthletes) {
            if (thisGuy.athleteName.equals(aName)) {
                eliFuckinSucks = thisGuy.result;
            }
        }
        return eliFuckinSucks.finalScore();
    }

    public boolean anyImprovement (Competition aComp) {
        boolean didImprove = false;
        for (Athlete thisGuy: this.listOfAthletes) {
            for (Athlete anotherGuy: aComp.listOfAthletes) {
                if (thisGuy.athleteName.equals(anotherGuy.athleteName) &&
                        thisGuy.result.finalScore() < anotherGuy.result.finalScore()) {

                        didImprove = true;

                }
            }
        }
        return didImprove;
    }
}
/*
There could be a helper function that returns the athlete of a given name from a list.
This would enable both finalScoreForAthlete and anyImprovement to call these methods when searching
for a athlete with a given name.
 */