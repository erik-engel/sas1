package sas1.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sas1.project.demo.model.Player;
import sas1.project.demo.repository.PlayerRepository;
import sas1.project.demo.util.IRepoServ;

import java.util.List;

@Service
public class PlayerService implements IRepoServ<Player> {

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public Player read(int id) {
        return playerRepository.read(id);
    }

    @Override
    public List<Player> readAll() {
        return playerRepository.readAll();
    }

    @Override
    public boolean create(Player player) {
        return playerRepository.create(player);
    }

    @Override
    public boolean update(Player player) {
        return playerRepository.update(player);
    }

    @Override
    public boolean delete(int id) {
        return playerRepository.delete(id);
    }
}
