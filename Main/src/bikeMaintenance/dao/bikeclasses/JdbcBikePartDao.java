package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.BikePart;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, partId);
        if (results.next()){
            bikePart = mapRowToBikePart(results);
        }
        return bikePart;
    }

    @Override
    public List<BikePart> getAllBicycleBikeParts(int bicycleId) {
        List<BikePart> bikePartList = new ArrayList<>();
        String sql = "Select * " +
                "FROM bike_part " +
                "WHERE bicycle_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, bicycleId);
        while (results.next()){
            bikePartList.add(mapRowToBikePart(results));
        }
        return bikePartList;
    }

    @Override
    public List<BikePart> getAllBicycleBikeParts(int bicycleId, String partType) {
        List<BikePart> bikePartList = new ArrayList<>();
        String sql = "Select * " +
                "FROM bike_part " +
                "WHERE bicycle_id = ? AND part_type = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, bicycleId, partType);
        while (results.next()){
            bikePartList.add(mapRowToBikePart(results));
        }
        return bikePartList;
    }

    @Override
    public BikePart createBikePart(BikePart bikePart) {
        String sql = "INSERT INTO bike_part (bicycle_id, name, description, manufacturer, model, model_year, part_type, " +
                "install_date, distance_in_meters, age_interval, distance_interval, material) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING bike_part_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, bikePart.getBicycleId(), bikePart.getName(),
                bikePart.getDescription(), bikePart.getManufacturer(), bikePart.getModel(), bikePart.getModelYear(),
                bikePart.getPartType(), bikePart.getInstallDate(), bikePart.getDistanceInMeters(),
                bikePart.getAgeInterval(), bikePart.getDistanceInterval(), bikePart.getMaterial());
        return getBikePart(newId);
    }

    @Override
    public void updateBikePart(BikePart updatedBikePart) {
        String sql = "UPDATE bike_part " +
                "SET bicycle_id = ?, name = ?, description = ?, manufacturer = ?, model = ?, model_year = ?, part_type = ?, " +
                "install_date = ?, distance_in_meters = ?, age_interval = ?, distance_interval = ?, material = ? " +
                "WHERE bike_part_id = ?";
        jdbcTemplate.update(sql, updatedBikePart.getBicycleId(), updatedBikePart.getName(),
                updatedBikePart.getDescription(), updatedBikePart.getManufacturer(), updatedBikePart.getModel(),
                updatedBikePart.getModelYear(), updatedBikePart.getPartType(), updatedBikePart.getInstallDate(),
                updatedBikePart.getDistanceInMeters(), updatedBikePart.getAgeInterval(), updatedBikePart.getDistanceInterval(),
                updatedBikePart.getMaterial(), updatedBikePart.getBikePartId());
    }

    @Override
    public void deleteBikePart(int partId) {

    }

    private BikePart mapRowToBikePart(SqlRowSet rowSet){
        BikePart bikePart = new BikePart();
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

        return bikePart;
    }
}
