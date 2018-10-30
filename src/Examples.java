import org.junit.Test;

import static org.junit.Assert.*;

public class Examples {

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