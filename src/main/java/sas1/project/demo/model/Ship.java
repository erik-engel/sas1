package sas1.project.demo.model;

public class Ship {
    int sailors;
    int maxSailors;
    //guns
    int rowsOfGuns;
    int gunsPrRow;
    int gunsSailorsNeeded;
    //sails
    int sailsHP;
    int sails;
    int maxSails;
    int sailsSailorsNeeded;
    //hulls
    int hullHP;
    int maxHullHP;
    //speed
    int speed;
    int maxSpeed;
    int maxSpeedChange;
    //moves
    int numberOfTurns;

    public Ship() {
    }

    public Ship(int sailors, int maxSailors, int rowsOfGuns, int gunsPrRow, int gunsSailorsNeeded, int sailsHP, int sails, int maxSails, int sailsSailorsNeeded, int hullHP, int maxHullHP, int speed, int maxSpeed, int maxSpeedChange, int numberOfTurns) {
        this.sailors = sailors;
        this.maxSailors = maxSailors;
        this.rowsOfGuns = rowsOfGuns;
        this.gunsPrRow = gunsPrRow;
        this.gunsSailorsNeeded = gunsSailorsNeeded;
        this.sailsHP = sailsHP;
        this.sails = sails;
        this.maxSails = maxSails;
        this.sailsSailorsNeeded = sailsSailorsNeeded;
        this.hullHP = hullHP;
        this.maxHullHP = maxHullHP;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.maxSpeedChange = maxSpeedChange;
        this.numberOfTurns = numberOfTurns;
    }

    public int getSailors() {
        return sailors;
    }

    public void setSailors(int sailors) {
        this.sailors = sailors;
    }

    public int getMaxSailors() {
        return maxSailors;
    }

    public void setMaxSailors(int maxSailors) {
        this.maxSailors = maxSailors;
    }

    public int getRowsOfGuns() {
        return rowsOfGuns;
    }

    public void setRowsOfGuns(int rowsOfGuns) {
        this.rowsOfGuns = rowsOfGuns;
    }

    public int getGunsPrRow() {
        return gunsPrRow;
    }

    public void setGunsPrRow(int gunsPrRow) {
        this.gunsPrRow = gunsPrRow;
    }

    public int getGunsSailorsNeeded() {
        return gunsSailorsNeeded;
    }

    public void setGunsSailorsNeeded(int gunsSailorsNeeded) {
        this.gunsSailorsNeeded = gunsSailorsNeeded;
    }

    public int getSailsHP() {
        return sailsHP;
    }

    public void setSailsHP(int sailsHP) {
        this.sailsHP = sailsHP;
    }

    public int getSails() {
        return sails;
    }

    public void setSails(int sails) {
        this.sails = sails;
    }

    public int getMaxSails() {
        return maxSails;
    }

    public void setMaxSails(int maxSails) {
        this.maxSails = maxSails;
    }

    public int getSailsSailorsNeeded() {
        return sailsSailorsNeeded;
    }

    public void setSailsSailorsNeeded(int sailsSailorsNeeded) {
        this.sailsSailorsNeeded = sailsSailorsNeeded;
    }

    public int getHullHP() {
        return hullHP;
    }

    public void setHullHP(int hullHP) {
        this.hullHP = hullHP;
    }

    public int getMaxHullHP() {
        return maxHullHP;
    }

    public void setMaxHullHP(int maxHullHP) {
        this.maxHullHP = maxHullHP;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeedChange() {
        return maxSpeedChange;
    }

    public void setMaxSpeedChange(int maxSpeedChange) {
        this.maxSpeedChange = maxSpeedChange;
    }

    public int getNumberOfTurns() {
        return numberOfTurns;
    }

    public void setNumberOfTurns(int numberOfTurns) {
        this.numberOfTurns = numberOfTurns;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "sailors=" + sailors +
                ", maxSailors=" + maxSailors +
                ", rowsOfGuns=" + rowsOfGuns +
                ", gunsPrRow=" + gunsPrRow +
                ", gunsSailorsNeeded=" + gunsSailorsNeeded +
                ", sailsHP=" + sailsHP +
                ", sails=" + sails +
                ", maxSails=" + maxSails +
                ", sailsSailorsNeeded=" + sailsSailorsNeeded +
                ", hullHP=" + hullHP +
                ", maxHullHP=" + maxHullHP +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", maxSpeedChange=" + maxSpeedChange +
                ", numberOfTurns=" + numberOfTurns +
                '}';
    }
}

