package sas1.project.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sas1.project.demo.model.Player;
import sas1.project.demo.util.IRepoServ;

import java.util.List;

@Repository
public class PlayerRepository implements IRepoServ<Player> {

    @Autowired
    JdbcTemplate template;

    @Override
    public Player read(int id) {
        String sql = "SELECT * FROM players WHERE player_id = ?";
        RowMapper<Player> rowMapper = new BeanPropertyRowMapper<>(Player.class);
        return template.queryForObject(sql,rowMapper,id);
    }

    @Override
    public List<Player> readAll() {
        String sql = "SELECT * FROM players";
        RowMapper<Player> rowMapper = new BeanPropertyRowMapper<>(Player.class);
        return template.query(sql,rowMapper);
    }

    @Override
    public boolean create(Player player) {
        String sql = "INSERT INTO players (player_name) VALUES (?)";
        return template.update(sql, player.getPlayerName()) > 0;
    }

    @Override
    public boolean update(Player player) {
        String sql = "UPDATE players SET player_name = ? WHERE player_id = ?";
        return template.update(sql, player.getPlayerName(), player.getPlayerId()) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM players WHERE player_id = ?";
        return template.update(sql,id) > 0;
    }
}
