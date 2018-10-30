import org.junit.Test;

import static org.junit.Assert.*;

public class Examples {

    SkiingResult skiing1 = new SkiingResult(120, 125, 110, 130, 1,3);
    SkiingResult skiing2 = new SkiingResult(120, 125,115,130,2,3);
    SkiingResult skiing3 = new SkiingResult(125,125,115,130,3,0);
    SkiingResult skiing4 = new SkiingResult(125 ,130,115,130, 4, 1);
    SkiingResult skiing5 = new SkiingResult(140, 200, 170, 185, 13, 12);

    @Test
    public void testSkiingPoints() {
        assertTrue(skiing1.pointsEarned() == 485);
    }
    @Test
    public void testSkiingPenalties() {
        assertTrue(skiing5.getPenalties() == 65);
    }

    ShootingRound[] rounds1 = {
            new ShootingRound(5),new ShootingRound(5),
            new ShootingRound(5),new ShootingRound(5)
    };
    ShootingRound[] rounds2 = {
            new ShootingRound(0),new ShootingRound(0),
            new ShootingRound(0),new ShootingRound(0)
    };
    ShootingRound[] rounds3 = {
            new ShootingRound(3),new ShootingRound(5),
            new ShootingRound(4),new ShootingRound(5)
    };
    ShootingResult shooting1 = new ShootingResult(rounds1);
    ShootingResult shooting2 = new ShootingResult(rounds2);
    ShootingResult shooting3 = new ShootingResult(rounds3);

    @Test
    public void testPointsEarned(){

    }
}