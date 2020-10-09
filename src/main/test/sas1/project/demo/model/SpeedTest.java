package sas1.project.demo.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SpeedTest {
    Ship.Direction direction = Ship.Direction.N;
    Ship s_generic;
    Ship s_brig;
    Ship s_man;
    Ship s_line;
    Wind wind;
    Cord cord;

    @BeforeEach
    void setupTestData(){
        wind = new Wind(1,"N",5);
        cord = new Cord(0,0);
        s_brig = new shipBrig(true,direction,cord, 60, 60, 1, 8, 24, 30, 4, 4, 24, 25, 25, 2, 2, 1, 1);
        s_man = new shipManAtWar(true,direction,cord, 340, 340, 3, 28, 84, 80, 24, 24, 144, 140, 140, 4, 4, 1, 1);
        s_line = new shipShipOfLine(true,direction,cord, 160, 160, 2, 16, 48, 60, 10, 10, 60, 60, 60, 5, 5, 2, 2);

    }
    @Test
    void speedChangeBrigSail(){
        //Fart ved færre antal antal sejl.
        Speed speed = new Speed(s_brig, wind);
        //Max antal sejl
        assertEquals(speed.speedChange(),2);
        //Halvt så mange sejl
        s_brig.setSails(2);
        assertEquals(speed.speedChange(),1);
        //Ingen sejl
        s_brig.setSails(0);
        assertEquals(speed.speedChange(),0);
    }
    @Test
    void speedChangeBrigDirection(){
        Speed speed = new Speed(s_brig, wind);
        //Fart ved ændring af skibets retning
        //Retning N(allerede sat)
        assertEquals(speed.speedChange(), 2);
        //Retning S - modsat vinden
        s_brig.setDirection(Ship.Direction.S);
        assertEquals(speed.speedChange(),0);
        //Retning NE og NW, samme effekt som N, vejen vinden peger.
        s_brig.setDirection(Ship.Direction.NE);
        assertEquals(speed.speedChange(), 2);
        s_brig.setDirection(Ship.Direction.NW);
        assertEquals(speed.speedChange(),2);
        //Retning SE og SW, modsat retning, ikke stik modsat.
        s_brig.setDirection(Ship.Direction.SE);
        assertEquals(speed.speedChange(),1);
        s_brig.setDirection(Ship.Direction.SW);
        assertEquals(speed.speedChange(),1);
    }

    //ændring af fart ift. vindstyrke testet på ShipOfLine, da denne skibstype har en højere maxSpeedChange ift. de to andre skibe.
    @Test
    void speedChangeSoLWindSpeed(){
        Speed speed = new Speed(s_line, wind);
        //Fart ved ændring af wind speed
        //windspeed 5, allerede sat
        s_line.setSpeed(0);
        assertEquals(speed.speedChange(),2);
        //windspeed 1
        s_line.setSpeed(0);
        wind.setWindSpeed(1);
        assertEquals(speed.speedChange(),1);
        //windspeed 8
        s_line.setSpeed(0);
        wind.setWindSpeed(8);
        assertEquals(speed.speedChange(),2);
        //windspeed 100
        s_line.setSpeed(0);
        wind.setWindSpeed(100);
        assertEquals(speed.speedChange(), 2);
        //windspeed 0
        s_line.setSpeed(0);
        wind.setWindSpeed(0);
        assertEquals(speed.speedChange(), 0);
    }

    //Tester kun MaW og SoL på sejl, da det kun er her i speedklassen, der reelt set er en forskel på hvilken skibstype vi har med at gøre

    @Test
    void speedChangeMaWSail(){
        //Fart ved færre antal antal sejl.
        Speed speed = new Speed(s_man, wind);
        //Max antal sejl
        assertEquals(speed.speedChange(),4);
        //Halvt så mange sejl
        s_man.setSails(12);
        assertEquals(speed.speedChange(),3);
        //25% sejl
        s_man.setSails(6);
        assertEquals(speed.speedChange(),2);
        //10%(ca) sejl
        s_man.setSails(2);
        assertEquals(speed.speedChange(),1);
        //Ingen sejl
        s_man.setSails(0);
        assertEquals(speed.speedChange(),0);
    }

    @Test
    void speedChangeSoLSail(){
        //Fart ved færre antal antal sejl.
        Speed speed = new Speed(s_line, wind);
        //Max antal sejl
        assertEquals(speed.speedChange(),5);
        //Halvt så mange sejl
        s_line.setSails(5);
        assertEquals(speed.speedChange(),3);
        //25%(ca) sejl
        s_line.setSails(2);
        assertEquals(speed.speedChange(),2);
        //10% sejl
        s_line.setSails(1);
        assertEquals(speed.speedChange(),1);
        //Ingen sejl
        s_line.setSails(0);
        assertEquals(speed.speedChange(),0);
    }

    @Test// test with Zero speed with windDirection setting to -1
    void speedchangeMAW(){
        // Tester på om speed forbliver 0 og reducere til minus tal ved svag modvind
        Speed speed = new Speed(s_man,wind);
        s_man.setSpeed(0);
        s_man.setDirection(Ship.Direction.SE);
        assertEquals(speed.speedChange(),0);
        //Tester på at skibets speed overholder fartgrænsen
        s_man.setSpeed(4);
        s_man.setDirection(Ship.Direction.NE);
        assertEquals(speed.speedChange(),4);
        //Tester på at skibet stopper i modvind
        s_man.setSpeed(4);
        s_man.setDirection(Ship.Direction.S);
        assertEquals(speed.speedChange(),0);

    }





}