package sas1.project.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovementTest {
    Movement movement;

    @BeforeEach
    void setup()
    {


        // initialisere klassen ocean
        char size = 's';
        Ocean generere = new Ocean(size);
        movement = new Movement();

    }

    @Test
    void movesTest() {
        Ship ship = new Ship();
        ship.setDirection(Ship.Direction.N);
        char size = 's';
        Ocean generere = new Ocean(size);
        Cord cord = new Cord(2,2);
        Hex hex = new Hex(cord);
        ship.setPosition(hex);
        ship.setNumberOfTurns(1);
        assertEquals(3, movement.getMove(ship).size());
        ship.setNumberOfTurns(0);
        assertEquals(1, movement.getMove(ship).size());
    }
}