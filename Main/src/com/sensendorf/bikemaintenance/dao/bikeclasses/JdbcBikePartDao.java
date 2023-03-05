package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.BikePart;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcBikePartDao implements BikePartDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcBikePartDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public BikePart getBikePart(int partId) {
        BikePart bikePart = null;
        String sql = "Select * " +
                "FROM bike_part " +
                "WHERE bike_part_id = ?;";
        try {
            bikePart = jdbcTemplate.queryForObject(sql, new BikePartMapper(), partId);
        } catch (Exception e) {
            return null;
            //TODO: log function
        }
        return bikePart;
    }

    @Override
    public List<BikePart> getAllBicycleBikeParts(int bicycleId) {
        List<BikePart> bikePartList = new ArrayList<>();
        String sql = "Select * " +
                "FROM bike_part " +
                "WHERE bicycle_id = ?;";
        try {
            bikePartList = jdbcTemplate.query(sql, new BikePartMapper(), bicycleId);
        } catch (Exception e) {
            return null;
            //TODO: log function
        }
        return bikePartList;
    }

    @Override
    public List<BikePart> getAllBicycleBikeParts(int bicycleId, String partType) {
        List<BikePart> bikePartList = new ArrayList<>();
        String sql = "Select * " +
                "FROM bike_part " +
                "WHERE bicycle_id = ? AND part_type = ?;";
        try {
            bikePartList = jdbcTemplate.query(sql, new BikePartMapper(), bicycleId, partType);
        } catch (Exception e) {
            return null;
            //TODO: log function
        }
        return bikePartList;
    }

    @Override
    public BikePart createBikePart(BikePart bikePart) {
        String sql = "INSERT INTO bike_part (bicycle_id, name, description, manufacturer, model, model_year, part_type, " +
                "install_date, distance_in_meters, age_interval, distance_interval, material, style) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING bike_part_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, bikePart.getBicycleId(), bikePart.getName(),
                bikePart.getDescription(), bikePart.getManufacturer(), bikePart.getModel(), bikePart.getModelYear(),
                bikePart.getPartType(), bikePart.getInstallDate(), bikePart.getDistanceInMeters(),
                bikePart.getAgeInterval(), bikePart.getDistanceInterval(), bikePart.getMaterial(), bikePart.getStyle());
        return getBikePart(newId);
    }

    @Override
    public void updateBikePart(BikePart updatedBikePart) {
        String sql = "UPDATE bike_part " +
                "SET bicycle_id = ?, name = ?, description = ?, manufacturer = ?, model = ?, model_year = ?, part_type = ?, " +
                "install_date = ?, distance_in_meters = ?, age_interval = ?, distance_interval = ?, material = ?, style = ? " +
                "WHERE bike_part_id = ?";
        jdbcTemplate.update(sql, updatedBikePart.getBicycleId(), updatedBikePart.getName(),
                updatedBikePart.getDescription(), updatedBikePart.getManufacturer(), updatedBikePart.getModel(),
                updatedBikePart.getModelYear(), updatedBikePart.getPartType(), updatedBikePart.getInstallDate(),
                updatedBikePart.getDistanceInMeters(), updatedBikePart.getAgeInterval(), updatedBikePart.getDistanceInterval(),
                updatedBikePart.getMaterial(), updatedBikePart.getStyle(), updatedBikePart.getBikePartId());
    }

    @Override
    public void deleteBikePart(int partId) {
        String sql = "UPDATE bike_part" +
                "SET active = false, date_deleted = ?" +
                "WHERE bike_part_id = ?;";
        jdbcTemplate.update(sql, LocalDateTime.now(), partId);

    }
}
