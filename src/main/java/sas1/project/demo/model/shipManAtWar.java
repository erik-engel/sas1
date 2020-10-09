package sas1.project.demo.model;

public class shipManAtWar extends Ship {
    int sailors = 340;
    int maxSailors = 340;
    //guns
    int rowsOfGuns = 3;
    int gunsPrRow = 28;
    int gunsSailorsNeeded = 84;
    //sails
    int sailsHP = 80;
    int sails = 24;
    int maxSails = 24;
    int sailsSailorsNeeded = 144;
    //hulls
    int hullHP = 140;
    int maxHullHP = 140;
    //speed
    int speed = 0;
    int maxSpeed = 4;
    int maxSpeedChange = 1;
    //moves
    int numberOfTurns = 1;

    public shipManAtWar() {
    }

    public shipManAtWar(boolean canTurn, Direction direction, Hex position, int sailors, int maxSailors, int rowsOfGuns, int gunsPrRow, int gunsSailorsNeeded, int selectedAmmo, int sailsHP, int sails, int maxSails, int sailsSailorsNeeded, int hullHP, int maxHullHP, int speed, int maxSpeed, int maxSpeedChange, int numberOfTurns, int sailors1, int maxSailors1, int rowsOfGuns1, int gunsPrRow1, int gunsSailorsNeeded1, int sailsHP1, int sails1, int maxSails1, int sailsSailorsNeeded1, int hullHP1, int maxHullHP1, int speed1, int maxSpeed1, int maxSpeedChange1, int numberOfTurns1) {
        super(canTurn, direction, position, sailors, maxSailors, rowsOfGuns, gunsPrRow, gunsSailorsNeeded, selectedAmmo, sailsHP, sails, maxSails, sailsSailorsNeeded, hullHP, maxHullHP, speed, maxSpeed, maxSpeedChange, numberOfTurns);
        this.sailors = sailors1;
        this.maxSailors = maxSailors1;
        this.rowsOfGuns = rowsOfGuns1;
        this.gunsPrRow = gunsPrRow1;
        this.gunsSailorsNeeded = gunsSailorsNeeded1;
        this.sailsHP = sailsHP1;
        this.sails = sails1;
        this.maxSails = maxSails1;
        this.sailsSailorsNeeded = sailsSailorsNeeded1;
        this.hullHP = hullHP1;
        this.maxHullHP = maxHullHP1;
        this.speed = speed1;
        this.maxSpeed = maxSpeed1;
        this.maxSpeedChange = maxSpeedChange1;
        this.numberOfTurns = numberOfTurns1;
    }

    public shipManAtWar(boolean canTurn, Direction direction, Hex position, int sailors, int maxSailors, int rowsOfGuns, int gunsPrRow, int gunsSailorsNeeded, int selectedAmmo, int sailsHP, int sails, int maxSails, int sailsSailorsNeeded, int hullHP, int maxHullHP, int speed, int maxSpeed, int maxSpeedChange, int numberOfTurns) {
        super(canTurn, direction, position, sailors, maxSailors, rowsOfGuns, gunsPrRow, gunsSailorsNeeded, selectedAmmo, sailsHP, sails, maxSails, sailsSailorsNeeded, hullHP, maxHullHP, speed, maxSpeed, maxSpeedChange, numberOfTurns);
    }
}
