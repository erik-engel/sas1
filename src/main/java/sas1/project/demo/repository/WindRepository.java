package sas1.project.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import sas1.project.demo.model.Wind;
import sas1.project.demo.util.IRepoServ;

import java.util.List;
@Repository
public class WindRepository implements IRepoServ<Wind> {
    @Autowired
    JdbcTemplate template;

    @Override
    public Wind read(int id) {
        String sql = "SELECT * FROM winds WHERE wind_id = ?";
        RowMapper<Wind> rowMapper = new BeanPropertyRowMapper<>(Wind.class);
        return template.queryForObject(sql,rowMapper,id);
    }

    @Override
    public List<Wind> readAll() {
        String sql = "SELECT * FROM winds";
        RowMapper<Wind> rowMapper = new BeanPropertyRowMapper<>(Wind.class);
        return template.query(sql,rowMapper);
    }

    @Override
    public boolean create(Wind wind) {
        String sql = "INSERT INTO winds (wind_id, wind_direction, wind_speed) VALUES (?, ?, ?)";
        return template.update(sql, wind.getWindId(), wind.getWindDirection(), wind.getWindSpeed()) > 0;
    }

    @Override
    public boolean update(Wind wind) {
        String sql = "UPDATE winds SET wind_id = ?, wind_direction = ?, wind_speed = ? WHERE wind_id = ?, ";
        return template.update(sql, wind.getWindId(), wind.getWindDirection(), wind.getWindSpeed()) > 0;
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM winds WHERE wind_id = ?";
        return template.update(sql,id) > 0;
    }
}
