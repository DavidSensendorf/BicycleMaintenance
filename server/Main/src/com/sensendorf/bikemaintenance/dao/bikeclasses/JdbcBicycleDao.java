package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.Bicycle;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcBicycleDao implements BicycleDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcBicycleDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Bicycle getBicycle(int bicycleId) {
        Bicycle bicycle = null;
        String sql = "Select * " +
                     "FROM bicycle " +
                     "WHERE bicycle_Id = ? AND active = true;";
        try {
            bicycle = jdbcTemplate.queryForObject(sql, new BicycleMapper(), bicycleId);
        } catch (Exception e) {
            return null;
            //TODO: log function
        }
        return bicycle;
    }

    @Override
    public List<Bicycle> getAllUserBicycles(int userId) {
        List<Bicycle> bicycleList= new ArrayList<>();
        String sql = "SELECT * " +
                "FROM bicycle " +
                "WHERE cyclist_id = ? AND active = true;";
        try {
            bicycleList = jdbcTemplate.query(sql, new BicycleMapper(), userId);
        } catch (Exception e) {
            return null;
            //TODO: log function
        }
        return bicycleList;
    }

    @Override
    public Bicycle createBicycle(Bicycle bicycle) {
        String sql = "INSERT INTO bicycle (name, cyclist_id, description, active) " +
                "VALUES (?, ?, ?, true) RETURNING bicycle_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, bicycle.getBicycleName(),
                bicycle.getCyclistId(), bicycle.getDescription());
        return getBicycle(newId);
    }

    @Override
    public boolean updateBicycle(Bicycle updatedBicycle) {
        String sql = "UPDATE bicycle " +
                "SET name = ?, description = ? " +
                "WHERE bicycle_id = ? AND active = true;";
        try {
            jdbcTemplate.update(sql, updatedBicycle.getBicycleName(), updatedBicycle.getDescription(), updatedBicycle.getBicycleId());
        } catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    /* TODO:  Some kind of logic to deal with orphan bike parts later on?*/
    public boolean deleteBicycle(int bicycleId) {
        String sql = "UPDATE bicycle " +
                "SET active = false, date_deleted = ? " +
                "WHERE bicycle_id = ?;";
        try{
            jdbcTemplate.update(sql, LocalDateTime.now(), bicycleId);
        }catch (Exception e) {
            return false;
        }
        return true;
    }

}
