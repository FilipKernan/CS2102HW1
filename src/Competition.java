
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
            if (thisGuy.result.shootingResult.numShootingRounds.size() != this.numShootingRounds) {
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
                if (thisGuy.athleteName.equals(anotherGuy.athleteName)) {
                    if (thisGuy.result.finalScore() < anotherGuy.result) {
                        didImprove = true;
                    }
                }
            }
        }
        return didImprove;
    }
}