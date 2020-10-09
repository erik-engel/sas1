package sas1.project.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipCurrentGunCapacityTest {

    ShipTestData shipTestData = new ShipTestData();
    Ship.Direction direction = Ship.Direction.N;
    Ship s_generic;
    Ship s_brig;
    Ship s_man;
    Ship s_line;

    @BeforeEach
    void setupTestData(){
    //ship types to test with guncapacity
    s_generic = shipTestData.getTestShip();
    s_brig = new shipBrig();
    s_man = new shipManAtWar();
    s_line = new shipShipOfLine();
    }

    @Test
    void genericCurrentGunCapacity() {
        assertEquals(s_generic.currentGunCapacity(), 8);
        //set sailors
        s_generic.setSailors(2);
        assertEquals(s_generic.currentGunCapacity(), 0);
        //set sailors
    }

    @Test
    void genericSailorCurrentGunCapacity() {
        //set too few sailors
        s_generic.setSailors(2);
        assertEquals(s_generic.currentGunCapacity(), 0);
        //set many sailors
        s_generic.setSailors(200000000);
        assertEquals(s_generic.currentGunCapacity(), 8);
        //set normal amount of sailors
        s_generic.setSailors(15);
        assertEquals(s_generic.currentGunCapacity(), 5);
        //set odd amount if seamen
        s_generic.setSailors(5);
        assertEquals(s_generic.currentGunCapacity(), 1);
    }





}