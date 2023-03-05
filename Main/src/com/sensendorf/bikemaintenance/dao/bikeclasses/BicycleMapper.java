package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.Bicycle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BicycleMapper implements RowMapper<Bicycle> {
    @Override
    public Bicycle mapRow(ResultSet rowSet, int rowNum) throws SQLException {
        Bicycle bicycle = new Bicycle();
        bicycle.setBicycleId(rowSet.getInt("bicycle_id"));
        bicycle.setCyclistId(rowSet.getInt("cyclist_id"));
        bicycle.setBicycleName(rowSet.getString("name"));
        bicycle.setDescription(rowSet.getString("description"));

        return bicycle;
    }
}
