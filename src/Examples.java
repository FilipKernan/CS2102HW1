import org.junit.Test;

import static org.junit.Assert.*;

public class Examples {

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