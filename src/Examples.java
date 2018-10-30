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

    FinalResult firstPlace = new FinalResult(shooting1, skiing1);
    FinalResult secondPlace = new FinalResult(shooting3, skiing2);
    FinalResult thirdPlace = new FinalResult(shooting3, skiing3);
    FinalResult fourthPlace = new FinalResult(shooting3, skiing4);
    FinalResult assPlace = new FinalResult(shooting2, skiing5);

    Athlete bestAthlete = new Athlete(firstPlace);
    Athlete worstAthlete = new Athlete(assPlace);

    @Test
    public void testBetterSkiierTrue(){
        assertTrue(bestAthlete.betterSkiier(worstAthlete));
    }
    @Test
    public void testBetterShooterTrue(){
        assertTrue(bestAthlete.betterShooter(worstAthlete));
    }
    @Test
    public void testBetterSkiierFalse(){
        assertFalse(worstAthlete.betterSkiier(bestAthlete));
    }
    @Test
    public void testBetterShooterFalse(){
        assertFalse(worstAthlete.betterShooter(bestAthlete));
    }
    @Test
    public void testHasBeatenTrue(){
        assertTrue(bestAthlete.hasBeaten(worstAthlete));
    }
    @Test
    public void testHasBeatenFalse(){
        assertFalse(worstAthlete.hasBeaten(bestAthlete));



    @Test
    public void testFirst() {
        assertTrue(firstPlace.finalScore() == 485 + 15 + 0 - 10);
    }
    @Test
    public void testSecond() {
        assertTrue(secondPlace.finalScore() == 490 + 15 + (12*60) - 7);
    }
    @Test
    public void testThird(){
        assertTrue(thirdPlace.finalScore() == 495 + 0 + (12*60) - 3);
    }
    @Test
    public void testFourth(){
        assertTrue(fourthPlace.finalScore() == 500 + 5 + (12*60) - 1);
    }
    @Test
    public void testAss(){
        assertTrue(assPlace.finalScore() == 695 + 60 + (20*60) - 0);

    }
}