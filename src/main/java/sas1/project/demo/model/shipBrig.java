package sas1.project.demo.model;

public class shipBrig extends Ship {


    int sailors = 60;
    int maxSailors = 60;
    //guns
    int rowsOfGuns = 1;
    int gunsPrRow = 8;
    int gunsSailorsNeeded = 24;
    //sails
    int sailsHP = 30;
    int sails = 4;
    int maxSails = 4;
    int sailsSailorsNeeded = 24;
    //hulls
    int hullHP = 25;
    int maxHullHP = 25;
    //speed
    int speed = 0;
    int maxSpeed = 2;
    int maxSpeedChange = 1;
    //moves
    int numberOfTurns = 1;

    public shipBrig() {
    }

    public shipBrig(boolean canTurn, Direction direction, Cord position, int sailors, int maxSailors, int rowsOfGuns, int gunsPrRow, int gunsSailorsNeeded, int sailsHP, int sails, int maxSails, int sailsSailorsNeeded, int hullHP, int maxHullHP, int speed, int maxSpeed, int maxSpeedChange, int numberOfTurns) {
        super(canTurn, direction, position, sailors, maxSailors, rowsOfGuns, gunsPrRow, gunsSailorsNeeded, sailsHP, sails, maxSails, sailsSailorsNeeded, hullHP, maxHullHP, speed, maxSpeed, maxSpeedChange, numberOfTurns);
    }


}
