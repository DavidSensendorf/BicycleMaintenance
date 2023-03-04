package bikemaintenance.dao.bikeclasses;

import bikemaintenance.model.bikeclasses.Brake;
import bikemaintenance.model.bikeclasses.BikePart;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;

public class JdbcBrakeDao implements BrakeDao {

    private final JdbcTemplate jdbcTemplate;
    private JdbcBikePartDao bikePartDao;
    public JdbcBrakeDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.bikePartDao = new JdbcBikePartDao(dataSource);
    }


    @Override
    public Brake getBrake(int brakeId) {
        Brake brake = null;
        String sql = "SELECT * " +
                "FROM brake " +
                "JOIN bike_part ON brake.bike_part_id = bike_part.bike_part_id " +
                "WHERE brake.bike_part_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, brakeId);
        if (results.next()) {
            brake = mapRowToBrake(results);
        }
        return brake;
    }

    @Override
    public List<Brake> getAllBicycleBrakes(int bicycleId) {
        return null;
    }

    @Override
    public List<Brake> getAllBicycleBrakes(int bicycleId, String partType) {
        return null;
    }

    @Override
    public Brake createBrake(Brake brake) {
        BikePart newBikePart = bikePartDao.createBikePart(brake);
        brake.setBikePartId(newBikePart.getBikePartId());
        String sql = "INSERT INTO brake (bike_part_id, pad_type, front) " +
                "VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, brake.getBikePartId(), brake.getPadType(), brake.isFront());
        return brake;
    }

    @Override
    public void updateBicycle(Brake updatedBrake) {

    }

    @Override
    public void deleteBrake(int brakeId) {

    }

    private Brake mapRowToBrake(SqlRowSet rowSet) {
        BikePart brake = new Brake();
        brake = bikePartDao.getBikePart(rowSet.getInt("bike_part_id"));
        brake.setPadType(rowSet.getString("pad_type"));
        brake.setFront(rowSet.getBoolean("front"));
        return brake;
    }
}
