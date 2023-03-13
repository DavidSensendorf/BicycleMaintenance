package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.DrivetrainComponent;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class DrivetrainComponentMapper implements RowMapper<DrivetrainComponent> {
    @Override
    public DrivetrainComponent mapRow(ResultSet rowSet, int rowNum) throws SQLException {
        DrivetrainComponent bikePart = new DrivetrainComponent();
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
        bikePart.setSpeeds(rowSet.getInt("speeds"));
        bikePart.setGearSize(rowSet.getString("gear_size"));
        bikePart.setLubeType(rowSet.getString("lube_type"));
        bikePart.setWaxed(rowSet.getBoolean("waxed"));

        return bikePart;
    }
}
