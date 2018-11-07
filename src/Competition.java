
import java.util.LinkedList;

public class Competition {
    int numShootingRounds;
    LinkedList<Athlete> listOfAthletes;

    public Competition(int numShootingRounds, LinkedList<Athlete> randomAthlete) {
        this.numShootingRounds = numShootingRounds;
        this.listOfAthletes = randomAthlete;
    }

    public LinkedList<Athlete> shootingDNF() {
        LinkedList<Athlete> didNotFinish = new LinkedList<Athlete>();
        for (Athlete thisGuy: listOfAthletes) {
            if (thisGuy.result.shootingResult.ShootingRounds.size() != this.numShootingRounds) {
                didNotFinish.add(thisGuy);
            }
        }
        return didNotFinish;
    }

    public FinalResult finalScoreForAthlete(String aName) {
        FinalResult eliFuckinSucks= null;
        for (Athlete thisGuy: listOfAthletes) {
            if (thisGuy.athleteName.equals(aName)) {
                eliFuckinSucks = thisGuy.result;
            }
        }
        return eliFuckinSucks;
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