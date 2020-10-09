package sas1.project.demo.model;

import java.util.List;

public class Round {
    private int roundId;
    private Ship ship;
    private List<Hex> movesList;
    private Hex target;

    public Round() {
    }

    public Round(int roundId, Ship ship, List<Hex> movesList, Hex target) {
        this.roundId = roundId;
        this.ship = ship;
        this.movesList = movesList;
        this.target = target;
    }

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public List<Hex> getMovesList() {
        return movesList;
    }

    public void setMovesList(List<Hex> movesList) {
        this.movesList = movesList;
    }

    public Hex getTarget() {
        return target;
    }

    public void setTarget(Hex target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Round{" +
                "roundId=" + roundId +
                ", ship=" + ship +
                ", movesList=" + movesList +
                ", target=" + target +
                '}';
    }
}
