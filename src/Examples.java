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
        assertTrue(skiing5.getPenalties() == 60);
    }


    ShootingRound roundMax = new ShootingRound(5);
    ShootingRound roundMin = new ShootingRound(0);
    ShootingRound roundVar = new ShootingRound(2);



    ShootingResult shooting1 = new ShootingResult(roundMax,roundMax,roundMax,roundMax);
    ShootingResult shooting2 = new ShootingResult(roundMin,roundMin,roundMin,roundMin);
    ShootingResult shooting3 = new ShootingResult(roundVar,roundVar,roundVar,roundVar);

    @Test
    public void testPointsEarnedMax(){
        assertTrue(shooting1.pointsEarned() == 20);
    }
    @Test
    public void testPointsEarnedMin(){
        assertTrue(shooting2.pointsEarned() == 0);
    }

    @Test
    public void testPointsEarnedVar(){
        assertTrue(shooting3.pointsEarned() == 8);
    }

    @Test
    public void testPenaltiesMax(){
        assertTrue(shooting2.getPenalties() == 20 * 60);
    }
    @Test
    public void testPenaltiesMin(){
        assertTrue(shooting1.getPenalties() == 0);
    }

    @Test
    public void testPenaltiesVar(){
        assertTrue(shooting3.getPenalties() == 12 * 60);
    }

}