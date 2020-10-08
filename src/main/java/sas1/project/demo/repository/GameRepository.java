package sas1.project.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sas1.project.demo.model.Game;
import sas1.project.demo.util.IRepoServ;

import java.util.List;

@Repository
public class GameRepository implements IRepoServ<Game> {

    @Autowired
    JdbcTemplate template;


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
