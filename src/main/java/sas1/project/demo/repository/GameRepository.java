package sas1.project.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sas1.project.demo.model.*;
import sas1.project.demo.util.IRepoServ;

import java.util.List;

@Repository
public class GameRepository implements IRepoServ<Game> {

    @Autowired
    JdbcTemplate template;

    Player p1 = new Player(1,"Ole");
    Player p2 = new Player(2,"Harley");
    //Ship shipP1 = new Ship(1, "shipBrig",1, new Hex(new Cord(1,2)), 2, 2, 2,2, 2, 2,2,2);
    //Ship shipP2 = new Ship(2, "shipBrig",2, new Hex(new Cord(4,4)), 2, 2, 2,2, 2, 2,2,2);
    Round roundP1 = new Round();
    Round roundP2 = new Round();
    Game g = new Game(1,new Ocean('m'),new Wind(1,"North",7),roundP1,roundP2);
    @Override
    public Game read(int id) {
        return null;
    }

    @Override
    public List<Game> readAll() {
        return null;
    }

    @Override
    public boolean create(Game game) {
        return false;
    }

    @Override
    public boolean update(Game game) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
