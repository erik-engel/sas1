package sas1.project.demo.model;

import java.util.Objects;

public class Hex {
    private Cord cord;
    private Hex north;
    private Hex south;
    private Hex northEast;
    private Hex southEast;
    private Hex northWest;
    private Hex southWest;

    public Hex(Cord cord){
        this.cord = cord;
    }

    public Cord getCord() {
        return cord;
    }

    public void setCord(Cord cord) {
        this.cord = cord;
    }

    public Hex getNorth() {
        return north;
    }

    public void setNorth(Hex north) {
        this.north = north;
    }

    public Hex getSouth() {
        return south;
    }

    public void setSouth(Hex south) {
        this.south = south;
    }

    public Hex getNorthEast() {
        return northEast;
    }

    public void setNorthEast(Hex northEast) {
        this.northEast = northEast;
    }

    public Hex getSouthEast() {
        return southEast;
    }

    public void setSouthEast(Hex southEast) {
        this.southEast = southEast;
    }

    public Hex getNorthWest() {
        return northWest;
    }

    public void setNorthWest(Hex northWest) {
        this.northWest = northWest;
    }

    public Hex getSouthWest() {
        return southWest;
    }

    public void setSouthWest(Hex southWest) {
        this.southWest = southWest;
    }

    @Override
    public boolean equals(Hex hex) {
        if (this == hex) return true;
        if (hex == null || getClass() != hex.getClass()) return false;
        return Objects.equals(cord, hex.cord);
    }

    @Override
    public String toString() {
        return cord.toString;
    }
}
