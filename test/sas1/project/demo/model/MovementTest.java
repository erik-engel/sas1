package sas1.project.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovementTest {

    @BeforeEach
    void setup()
    {


        // initialisere klassen ocean
        char size = 's';
        Ocean generere = new Ocean(size);

    }

    @Test
    void movesTest() {
        Ship ship = new Ship();
        ship.setDirection(Ship.Direction.N);
        ship.setNumberOfTurns(1);
        char size = 's';
        Ocean generere = new Ocean(size);
        Hex hex = new Hex();
        Cord cord = new Cord(2,2);
        hex.setCord(cord);
        ship.setPosition(hex);
        Movement move = new Movement(ship);
        assertEquals(3, move.newHex.size());
        ship.setNumberOfTurns(0);
        move = new Movement(ship);
        assertEquals(1, move.newHex.size());
    }
}