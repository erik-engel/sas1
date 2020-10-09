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
    Ship attackership;
    Ship targetship;
    Ship.Direction direction = Ship.Direction.N;
    ArrayList<Integer> crits = new ArrayList<>();
    Ammunition ammo = new Ammunition();

    public static Object[][] setCannonBallDamageTestData() {
        //1st value is rolled dice int, 2nd is expected hull HP value, 3rd sails HP, 4rd sailors, 5th canturn
        return new Object[][]{
                {1, 0, 30, 60, true},
                {2, 25, 30, 60, false},
                {10,24, 30, 60, true}
        };
    }

    public static Object[][] setChainDamageTestData() {
        //1st value is rolled dice int, 2nd is expected hull HP value, 3rd sails HP, 4rd sailors, 5th canturn
        return new Object[][]{
                {1, 25, 0, 60, true},
                {2, 25, 20, 60, true},
                {10,25, 29, 60, true}
        };
    }

    public static Object[][] setGrapeShotDamageTestData() {
        //1st value is rolled dice int, 2nd is expected hull HP value, 3rd sails HP, 4rd sailors, 5th canturn
        return new Object[][]{
                {1, 25, 30, 30, true},
                {2, 25, 30, 45, true},
                {10,25, 30, 59, true}
        };
    }

    @BeforeEach
    void setupTestData(){
        //ship types to test with guncapacity
        attackership = shipTestData.getTestShip();
        targetship = shipTestData.getTestShip();
        crits.add(0,1);
        crits.add(1,2);
        ammo.setCritEffect(crits);
    }

    @ParameterizedTest
    @MethodSource("setCannonBallDamageTestData")
    void setDamageCannonBall(int diceroll, int hull_hp, int sails_hp, int sailors, boolean can_turn) {
        Attack g1 = spy(new Attack());
        doReturn(diceroll).when(g1).getRandomNumber();
        g1.setDamage(attackership, targetship, 10);
        //check various damage done to the ship
        assertEquals(hull_hp, targetship.getHullHP());
        assertEquals(sails_hp, targetship.getSailsHP());
        assertEquals(sailors, targetship.getSailors());
        assertEquals(can_turn, targetship.isCanTurn());
    }

    @ParameterizedTest
    @MethodSource("setChainDamageTestData")
    void setDamageChain(int diceroll, int hull_hp, int sails_hp, int sailors, boolean can_turn) {
        //set different ammunition
        attackership.setSelectedAmmo(2);
        Attack g1 = spy(new Attack());
        doReturn(diceroll).when(g1).getRandomNumber();
        g1.setDamage(attackership, targetship, 10);
        //check various damage done to the ship
        assertEquals(hull_hp, targetship.getHullHP());
        assertEquals(sails_hp, targetship.getSailsHP());
        assertEquals(sailors, targetship.getSailors());
        assertEquals(can_turn, targetship.isCanTurn());
    }

    @ParameterizedTest
    @MethodSource("setGrapeShotDamageTestData")
    void setDamageGrapeShot(int diceroll, int hull_hp, int sails_hp, int sailors, boolean can_turn) {
        //set different ammunition
        attackership.setSelectedAmmo(3);
        Attack g1 = spy(new Attack());
        doReturn(diceroll).when(g1).getRandomNumber();
        g1.setDamage(attackership, targetship, 10);
        //check various damage done to the ship
        assertEquals(hull_hp, targetship.getHullHP());
        assertEquals(sails_hp, targetship.getSailsHP());
        assertEquals(sailors, targetship.getSailors());
        assertEquals(can_turn, targetship.isCanTurn());
    }
//
//    @ParameterizedTest
//    @MethodSource("setDamageTestData")
//    void setDamage(int diceroll, int hull_hp) {
//        Attack g1 = spy(new Attack());
//        doReturn(diceroll).when(g1).getRandomNumber();
//        LOGGER.info("current hp "+Integer.toString(targetship.getHullHP()));
//        g1.setDamage(attackership, targetship, 10);
//        LOGGER.info("dice roll    "+diceroll);
//        //LOGGER.info("gun capacity "+Integer.toString(s_generic1.currentGunCapacity()));
//        //LOGGER.info("damage       "+Integer.toString(g1.getDamage()));
//        LOGGER.info(Integer.toString(attackership.currentGunCapacity()));
//
//        LOGGER.info("current hp after "+Integer.toString(targetship.getHullHP()));
//        LOGGER.info("can turn ? "+(targetship.isCanTurn()));
//
//        assertEquals(hull_hp, targetship.getHullHP());
//    }








}