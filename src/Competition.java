import sun.awt.image.ImageWatched;

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
}
