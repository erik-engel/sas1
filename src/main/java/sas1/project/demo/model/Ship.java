package sas1.project.demo.model;

public class Ship {
    int guns;
    int sailors;
    int maxSailors;
    int sails;
    int maxSails;
    int hull;
    int maxHull;
    int speed;
    int maxSpeed;
    int maxSpeedChange;

    public Ship() {
    }

    public Ship(int guns, int sailors, int maxSailors, int sails, int maxSails, int hull, int maxHull, int speed, int maxSpeed, int maxSpeedChange) {
        this.guns = guns;
        this.sailors = sailors;
        this.maxSailors = maxSailors;
        this.sails = sails;
        this.maxSails = maxSails;
        this.hull = hull;
        this.maxHull = maxHull;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.maxSpeedChange = maxSpeedChange;
    }

    public int getGuns() {
        return guns;
    }

    public void setGuns(int guns) {
        this.guns = guns;
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

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }

    public int getMaxHull() {
        return maxHull;
    }

    public void setMaxHull(int maxHull) {
        this.maxHull = maxHull;
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

    @Override
    public String toString() {
        return "Ship{" +
                "guns=" + guns +
                ", sailors=" + sailors +
                ", maxSailors=" + maxSailors +
                ", sails=" + sails +
                ", maxSails=" + maxSails +
                ", hull=" + hull +
                ", maxHull=" + maxHull +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", maxSpeedChange=" + maxSpeedChange +
                '}';
    }
}
