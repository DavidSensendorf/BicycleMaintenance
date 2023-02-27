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
    public BikePart createBikePart(BikePart bikePart) {
        String sql = "INSERT INTO bike_part (bicycle_id, name, description, install_date, distance_in_meters, age_interval, " +
                "distance_interval, manufacturer, model, model_year, part_type, pad_type, speeds, part_size, lube_type, " +
                "days_since_lube, meters_since_lube, waxed, tubeless, style, electric, front, material, sealant_age) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING bike_part_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, bikePart.getBicycleId(), bikePart.getName(),
                bikePart.getDescription(), bikePart.getInstallDate(), bikePart.getDistanceInMeters(), bikePart.getAgeInterval(),
                bikePart.getDistanceInterval(), bikePart.getManufacturer(), bikePart.getModel(), bikePart.getModelYear(),
                bikePart.getPartType(), );
    }

    @Override
    public void updateBikePart(BikePart updatedBikePart) {

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
        bikePart.setPadType(rowSet.getString("pad_type"));
        bikePart.setSpeeds(rowSet.getInt("speeds"));
        bikePart.setSize(rowSet.getString("part_size"));
        bikePart.setLubeType(rowSet.getString("lube_type"));
        bikePart.setDaysSinceLube(rowSet.getInt("days_since_lube"));
        bikePart.setMetersSinceLube(rowSet.getInt("meters_since_lube"));
        bikePart.setWaxed(rowSet.getBoolean("waxed"));
        bikePart.setTubeless(rowSet.getBoolean("tubeless"));
        bikePart.setStyle(rowSet.getString("style"));
        bikePart.setElectric(rowSet.getBoolean("electric"));
        bikePart.setFront(rowSet.getBoolean("front"));
        bikePart.setMaterial(rowSet.getString("material"));

        return bikePart;
    }
}
