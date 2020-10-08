package sas1.project.demo.model;

public class shipShipOfLine extends Ship {

    int sailors = 160;
    int maxSailors = 160;
    //guns
    int rowsOfGuns = 2;
    int gunsPrRow = 16;
    int gunsSailorsNeeded = 48;
    //sails
    int sailsHP = 60;
    int sails = 10;
    int maxSails = 10;
    int sailsSailorsNeeded = 60;
    //hulls
    int hullHP = 60;
    int maxHullHP = 60;
    //speed
    int speed = 0;
    int maxSpeed = 5;
    int maxSpeedChange = 2;
    //moves
    int numberOfTurns = 2;

    public shipShipOfLine() {
    }

    public shipShipOfLine(boolean canTurn, Direction direction, Cord position, int sailors, int maxSailors, int rowsOfGuns, int gunsPrRow, int gunsSailorsNeeded, int sailsHP, int sails, int maxSails, int sailsSailorsNeeded, int hullHP, int maxHullHP, int speed, int maxSpeed, int maxSpeedChange, int numberOfTurns) {
        super(canTurn, direction, position, sailors, maxSailors, rowsOfGuns, gunsPrRow, gunsSailorsNeeded, sailsHP, sails, maxSails, sailsSailorsNeeded, hullHP, maxHullHP, speed, maxSpeed, maxSpeedChange, numberOfTurns);
    }

}
