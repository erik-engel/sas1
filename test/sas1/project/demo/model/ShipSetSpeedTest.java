package sas1.project.demo.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class ShipSetSpeedTest {

    ShipTestData shipTestData = new ShipTestData();
    Ship.Direction direction = Ship.Direction.N;
    Ship s1 = shipTestData.getTestShip();


    @ParameterizedTest(name= "{index}: setSpeed({0})")
    @ValueSource(ints = {-1, 500})
    void setSpeedOutlierTest(int input) {
        assertThrows(IllegalArgumentException.class, () -> s1.setSpeed(input), "illegal input");
    }

    @ParameterizedTest(name= "{index}: setSpeed({0})")
    @ValueSource(ints = {1, 2})
    void setSpeedAcceptableValuesTest(int input) {
        s1.setSpeed(input);
        assertEquals(input, s1.getSpeed());
    }




}