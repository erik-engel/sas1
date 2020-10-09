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
    // Ammo
    private int selectedAmmo = 1;

    public shipBrig() {
    }

    public shipBrig(boolean canTurn, Direction direction, Hex position, int sailors, int maxSailors, int rowsOfGuns, int gunsPrRow, int gunsSailorsNeeded, int selectedAmmo, int sailsHP, int sails, int maxSails, int sailsSailorsNeeded, int hullHP, int maxHullHP, int speed, int maxSpeed, int maxSpeedChange, int numberOfTurns, int sailors1, int maxSailors1, int rowsOfGuns1, int gunsPrRow1, int gunsSailorsNeeded1, int sailsHP1, int sails1, int maxSails1, int sailsSailorsNeeded1, int hullHP1, int maxHullHP1, int speed1, int maxSpeed1, int maxSpeedChange1, int numberOfTurns1) {
        super(canTurn, direction, position, sailors, maxSailors, rowsOfGuns, gunsPrRow, gunsSailorsNeeded, selectedAmmo, sailsHP, sails, maxSails, sailsSailorsNeeded, hullHP, maxHullHP, speed, maxSpeed, maxSpeedChange, numberOfTurns);
        this.sailors = sailors1;
        this.maxSailors = maxSailors1;
        this.rowsOfGuns = rowsOfGuns1;
        this.gunsPrRow = gunsPrRow1;
        this.gunsSailorsNeeded = gunsSailorsNeeded1;
        this.selectedAmmo = selectedAmmo;
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
}
