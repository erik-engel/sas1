package sas1.project.demo.model;

public class Game {
    private int gameId;
    private Ocean ocean;
    private Wind wind;
    private Round roundP1;
    private Round roundP2;

    public Game() {
    }

    public Game(int gameId, Ocean ocean, Wind wind, Round roundP1, Round roundP2) {
        this.gameId = gameId;
        this.ocean = ocean;
        this.wind = wind;
        this.roundP1 = roundP1;
        this.roundP2 = roundP2;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public Ocean getOcean() {
        return ocean;
    }

    public void setOcean(Ocean ocean) {
        this.ocean = ocean;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Round getRoundP1() {
        return roundP1;
    }

    public void setRoundP1(Round roundP1) {
        this.roundP1 = roundP1;
    }

    public Round getRoundP2() {
        return roundP2;
    }

    public void setRoundP2(Round roundP2) {
        this.roundP2 = roundP2;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", ocean=" + ocean +
                ", wind=" + wind +
                ", roundP1=" + roundP1 +
                ", roundP2=" + roundP2 +
                '}';
    }
}
