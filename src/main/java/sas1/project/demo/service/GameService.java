package sas1.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas1.project.demo.model.Game;
import sas1.project.demo.repository.GameRepository;
import sas1.project.demo.repository.TestRepository;
import sas1.project.demo.util.IRepoServ;

import java.util.List;

@Service
public class GameService implements IRepoServ<Game> {

    @Autowired
    GameRepository gameRepository;
    TestRepository testRepository;


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
        return testRepository.testGame();
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
