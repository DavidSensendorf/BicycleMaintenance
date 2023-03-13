package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.Brake;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class BrakeMapper implements RowMapper<Brake> {
    @Override
    public Brake mapRow(ResultSet rowSet, int rowNum) throws SQLException {
        Brake bikePart = new Brake();
        bikePart.setBikePartId(rowSet.getInt("bike_part_id"));
        bikePart.setBicycleId(rowSet.getInt("bicycle_id"));
        bikePart.setName(rowSet.getString("name"));
        bikePart.setDescription(rowSet.getString("description"));
        bikePart.setInstallDate(Objects.requireNonNull(rowSet.getDate("install_date")).toLocalDate());
        bikePart.setDistanceInMeters(rowSet.getInt("distance_in_meters"));
        bikePart.setAgeInterval(rowSet.getInt("age_interval"));
        bikePart.setDistanceInterval(rowSet.getInt("distance_interval"));
        bikePart.setManufacturer(rowSet.getString("manufacturer"));
        bikePart.setModel(rowSet.getString("model"));
        bikePart.setModelYear(rowSet.getInt("model_year"));
        bikePart.setPartType(rowSet.getString("part_type"));
        bikePart.setMaterial(rowSet.getString("material"));
        bikePart.setStyle(rowSet.getString("style"));
        bikePart.setFront(rowSet.getBoolean("front"));
        bikePart.setPadType("pad_type");
        return bikePart;
    }
}
