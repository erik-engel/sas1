package sas1.project.demo.repository;

import sas1.project.demo.model.*;

public class TestRepository {
    public Game testGame(){
        Player p1 = new Player(1,"Ole");
        Player p2 = new Player(2,"Harley");
        //Ship shipP1 = new Ship(1, "shipBrig",1, new Hex(new Cord(1,2)), 2, 2, 2,2, 2, 2,2,2);
        //Ship shipP2 = new Ship(2, "shipBrig",2, new Hex(new Cord(4,4)), 2, 2, 2,2, 2, 2,2,2);
        Round roundP1 = new Round();
        Round roundP2 = new Round();
        Game g = new Game(1,new Ocean('m'),new Wind(1,"North",7),roundP1,roundP2);
        return g;
    }
}
