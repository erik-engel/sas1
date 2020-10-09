package sas1.project.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AttackTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(Attack.class);
    ShipTestData shipTestData = new ShipTestData();
    Ship s_generic1;
    Ship s_generic2;
    Ship.Direction direction = Ship.Direction.N;
    ArrayList<Integer> crits = new ArrayList<>();
    Ammunition ammo = new Ammunition();

    public static Object[][] setDamageTestData() {
        //first value is rolled dice int, second is expected damage value
        return new Object[][]{
                {1, 0},
                {2, 25},
                {10,24}
        };
    }

    @BeforeEach
    void setupTestData(){
        //ship types to test with guncapacity
        s_generic1 = shipTestData.getTestShip();
        s_generic2 = shipTestData.getTestShip();
        crits.add(0,1);
        crits.add(1,2);
        ammo.setCritEffect(crits);
    }

    @ParameterizedTest
    @MethodSource("setDamageTestData")
    void setDamage(int diceroll, int hull_hp) {
        Attack g1 = spy(new Attack());
        doReturn(diceroll).when(g1).getRandomNumber();
        LOGGER.info("current hp "+Integer.toString(s_generic2.getHullHP()));
        g1.setDamage(s_generic1, s_generic2, 10);
        LOGGER.info("dice roll    "+diceroll);
        //LOGGER.info("gun capacity "+Integer.toString(s_generic1.currentGunCapacity()));
        //LOGGER.info("damage       "+Integer.toString(g1.getDamage()));
        LOGGER.info(Integer.toString(s_generic1.currentGunCapacity()));

        LOGGER.info("current hp after "+Integer.toString(s_generic2.getHullHP()));
        LOGGER.info("can turn ? "+(s_generic2.isCanTurn()));

        assertEquals(hull_hp, s_generic2.getHullHP());
    }

    @ParameterizedTest
    @MethodSource("setDamageTestData")
    void setDamage(int diceroll, int hull_hp) {
        Attack g1 = spy(new Attack());
        doReturn(diceroll).when(g1).getRandomNumber();
        LOGGER.info("current hp "+Integer.toString(s_generic2.getHullHP()));
        g1.setDamage(s_generic1, s_generic2, 10);
        LOGGER.info("dice roll    "+diceroll);
        //LOGGER.info("gun capacity "+Integer.toString(s_generic1.currentGunCapacity()));
        //LOGGER.info("damage       "+Integer.toString(g1.getDamage()));
        LOGGER.info(Integer.toString(s_generic1.currentGunCapacity()));

        LOGGER.info("current hp after "+Integer.toString(s_generic2.getHullHP()));
        LOGGER.info("can turn ? "+(s_generic2.isCanTurn()));

        assertEquals(hull_hp, s_generic2.getHullHP());
    }








}