package sas1.project.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    //Ships directions
    public enum Direction {
        N,
        NE,
        SE,
        S,
        SW,
        NW
    }
    private boolean canTurn=true;
    private Direction direction;
    //Coordinate class needs definition from Ocean
    private String position;

    private double sailors;
    private int maxSailors;
    //guns
    private int rowsOfGuns;
    private int gunsPrRow;
    private int gunsSailorsNeeded;
    private int selectedAmmo;
    //sails
    private double sailsHP;
    private int sails;
    private int maxSails;
    private int sailsSailorsNeeded;
    //hulls
    private Double hullHP;
    private int maxHullHP;
    //speed
    private int speed;
    private int maxSpeed;
    private int maxSpeedChange;
    //moves
    private int numberOfTurns;

    public Ship() {
    }

    public Ship(boolean canTurn, Direction direction, String position, double sailors, int maxSailors, int rowsOfGuns, int gunsPrRow, int gunsSailorsNeeded, int selectedAmmo, double sailsHP, int sails, int maxSails, int sailsSailorsNeeded, double hullHP, int maxHullHP, int speed, int maxSpeed, int maxSpeedChange, int numberOfTurns) {
        this.canTurn = canTurn;
        this.direction = direction;
        this.position = position;
        this.sailors = sailors;
        this.maxSailors = maxSailors;
        this.rowsOfGuns = rowsOfGuns;
        this.gunsPrRow = gunsPrRow;
        this.gunsSailorsNeeded = gunsSailorsNeeded;
        this.selectedAmmo = selectedAmmo;
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

    public int getSelectedAmmo() {
        return selectedAmmo;
    }

    public void setSelectedAmmo(int selectedAmmo) {
        this.selectedAmmo = selectedAmmo;
    }

    public boolean isCanTurn() {
        return canTurn;
    }

    public void setCanTurn(boolean canTurn) {
        this.canTurn = canTurn;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHullHP(Double hullHP) {
        this.hullHP = hullHP;
    }

    public double getSailors() {
        return sailors;
    }

    public void setSailors(double sailors) {
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

    public double getSailsHP() {
        return sailsHP;
    }

    public void setSailsHP(double sailsHP) {
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

    public double getHullHP() {
        return hullHP;
    }

    public void setHullHP(double hullHP) {
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
        if (speed<0){
            throw new IllegalArgumentException();
        }
        else if (speed>this.maxSpeed){
            throw new IllegalArgumentException();
        }
        else {
            this.speed = speed;
        }
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

    public double currentGunCapacity(){
        int guns = (this.gunsPrRow*this.rowsOfGuns);
        if (this.sailors<3) {
            return 0;
        }
        double sailorsPerGun = this.sailors/3;
        if (guns>sailorsPerGun){
            return sailorsPerGun;
        }
        else { return guns; }
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

