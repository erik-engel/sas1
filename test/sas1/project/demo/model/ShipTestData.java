package sas1.project.demo.model;

public class ShipTestData {

    public Ship getTestShip(){
        Ship.Direction direction = Ship.Direction.N;
        return new Ship(true, direction, new Hex(new Cord(1,2)), 60,60, 1, 8, 24, 1, 30, 4 , 4 ,24 , 25, 25,0,2,1,1);
    }

}
