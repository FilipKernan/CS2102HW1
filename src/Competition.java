import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Competition {
    int numShootingRounds;
    LinkedList<Athlete> listOfAthletes;

    public Competition(int numShootingRounds, LinkedList<Athlete> randomAthlete) {
        this.numShootingRounds = numShootingRounds;
        this.listOfAthletes = randomAthlete;
    }
}
