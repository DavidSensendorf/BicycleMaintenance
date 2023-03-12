package com.sensendorf.bikemaintenance.dao.userdata;

import com.sensendorf.bikemaintenance.model.userdata.Cyclist;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class JdbcCyclistDao implements CyclistDao{
    private final JdbcTemplate jdbcTemplate;

    public JdbcCyclistDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Cyclist getCyclist(int cyclistId) {
        Cyclist cyclist = null;
        String sql = "SELECT * " +
                "FROM cyclist " +
                "WHERE cyclist_id = ? AND active = true;";
        try {
            cyclist = jdbcTemplate.queryForObject(sql, new CyclistMapper(), cyclistId);
        } catch (DataAccessException e){
            //TODO: log function
        }
        return cyclist;
    }

    @Override
    public Cyclist createCyclist(Cyclist cyclist) {
        String sql = "INSERT INTO cyclist (name, email, login, password) " +
                "VALUES (?, ?, ?, ?) RETURNING cyclist_id;";
        try {
            Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, cyclist.getName(), cyclist.getEmail(),
                    cyclist.getLogin(), cyclist.getPassword());
            return getCyclist(newId);
        } catch (DataAccessException e){
            //todo: log
        }
        return null;
    }

    @Override
    public boolean updateCyclist(Cyclist updatedCyclist) {
        String sql = "UPDATE cyclist " +
                "SET name = ?, email = ?, login = ?, password = ? " +
                "WHERE cyclist_id = ? AND active = true;";
        try {
            jdbcTemplate.update(sql, updatedCyclist.getName(), updatedCyclist.getEmail(), updatedCyclist.getLogin(),
                    updatedCyclist.getPassword());
            return true;
        } catch (DataAccessException e){
            //todo: log
        }
        return false;
    }

    //todo: orphan entries?
    @Override
    public boolean deleteCyclist(int cyclistId) {
        String sql = "UPDATE cyclist " +
                "SET active = false, date_deleted = ? " +
                "WHERE cyclist_id = ?;";
        try {
            jdbcTemplate.update(sql, LocalDateTime.now(), cyclistId);
            return true;
        } catch (DataAccessException e){
            //TODO: log
        }
        return false;
    }
}
