package sas1.project.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GunControlTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(Attack.class);
    Ship s_generic;
    Ship.Direction direction = Ship.Direction.N;
    ArrayList<Integer> crits = new ArrayList<>();
    Ammunition ammo = new Ammunition();

    public static Object[][] setDamageTestData() {
        //first value is rolled dice int, second is expected damage value
        return new Object[][]{
                {1, 1},
                {2, 2},
                {10,4}
        };
    }

    @BeforeEach
    void setupTestData(){
        //ship types to test with guncapacity
        s_generic = new Ship(true, direction, "center", 60,60, 1, 8, 24, 30, 4 , 4 ,24 , 25, 25,0,2,1,1);
        crits.add(0,1);
        crits.add(1,2);
        ammo.setCritEffect(crits);
    }

    @ParameterizedTest
    @MethodSource("setDamageTestData")
    void setDamage(int diceroll, int expected_damage) {
        Attack g1 = spy(new Attack());
        doReturn(diceroll).when(g1).getRandomNumber();
        g1.setDamage(s_generic, ammo);
        LOGGER.info("dice roll    "+diceroll);
        LOGGER.info("gun capacity "+Integer.toString(s_generic.currentGunCapacity()));
        LOGGER.info("damage       "+Integer.toString(g1.getDamage()));
        assertEquals(expected_damage, g1.getDamage());


    }
}