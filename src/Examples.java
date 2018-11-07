import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Examples {


    SkiingResult skiing1 = new SkiingResult( 1,120, 125, 110, 130, 3);
    SkiingResult skiing2 = new SkiingResult(2, 120, 125,115,130,3);
    SkiingResult skiing3 = new SkiingResult(3,125,125,115,130,0);
    SkiingResult skiing4 = new SkiingResult(4,125 ,130,115,130,  1);
    SkiingResult skiing5 = new SkiingResult(13, 140, 200, 170, 185,  12);

    @Test
    public void testSkiingPoints() {
        assertTrue(skiing1.pointsEarned() == 485);
    }
    @Test
    public void testSkiingPenalties() {
        assertTrue(skiing5.getPenalties() == 60);
    }


    ShootingRound roundMax = new ShootingRound(5, true);
    ShootingRound roundMin = new ShootingRound(0, true);
    ShootingRound roundVar = new ShootingRound(2, false);



    ShootingResult shooting1 = new ShootingResult(roundMax,roundMax,roundMax,roundMax);
    ShootingResult shooting2 = new ShootingResult(roundMin,roundMin,roundMin,roundMin);
    ShootingResult shooting3 = new ShootingResult(roundVar,roundVar,roundVar,roundVar);
    ShootingResult shooting4 = new ShootingResult(roundMax,roundVar,roundVar,roundVar);

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

    Athlete bestAthlete = new Athlete(firstPlace, "Harry");
    Athlete worstAthlete = new Athlete(assPlace, "Conner");

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
    public void testHasBeatenFalse() {
        assertFalse(worstAthlete.hasBeaten(bestAthlete));
    }

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

    @Test
    public void testBestRoundByTypeFalse(){
        assertTrue(shooting4.bestRoundByType(false).equals(roundVar));
    }
    @Test
    public void testBestRoundByTypeTrue(){
        assertTrue(shooting4.bestRoundByType(true).equals(roundMax));
    }

    public MassStartResult massStartResult1 = new MassStartResult(1,1,10,10,20,20,10);
    public MassStartResult massStartResult2 = new MassStartResult(1,2,10,15,20,20,15);

    @Test
    public void massStartResult1Points(){
        assertTrue(massStartResult1.pointsEarned() == 60);
    }
    @Test
    public void massStartResult2Points(){
        assertTrue(massStartResult2.pointsEarned() == 65);
    }

    @Test
    public void massStartResult1Penalties(){
        assertTrue(massStartResult1.getPenalties() == 5*10);
    }
    @Test
    public void massStartResult2Penalties(){
        assertTrue(massStartResult2.getPenalties() == 5*15);
    }
    public LinkedList<Athlete> fakeAthleteList = new LinkedList<>();
    @Before
    public void createFakeList() {
        fakeAthleteList.add(bestAthlete);
        fakeAthleteList.add(worstAthlete);
    }

    Competition fakeComp1 = new Competition(4, fakeAthleteList);
    Competition fakeComp2 = new Competition(5, fakeAthleteList);

    @Test
    public void checkShootingDNF() {
        assertTrue(fakeComp1.shootingDNF().size() == 0);
    }
    @Test
    public void checkShootingDNFagain() {
        assertTrue(fakeComp2.shootingDNF().size() == 2);
    }
}