package bikemaintenance.dao.bikeclasses;

import bikemaintenance.model.bikeclasses.Brake;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;

public class JdbcBrakeDao implements BrakeDao {

    private final JdbcTemplate jdbcTemplate;
    private JdbcBikePartDao bikePartDao;
    public JdbcBrakeDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public Brake getBrake(int brakeId) {
        Brake brake = null;
        String sql = "SELECT * " +
                "FROM brake " +
                "WHERE brake_id = ?";
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
        return null;
    }

    @Override
    public void updateBicycle(Brake updatedBrake) {

    }

    @Override
    public void deleteBrake(int brakeId) {

    }

    private Brake mapRowToBrake(SqlRowSet rowSet) {
        Brake brake = (Brake) bikePartDao.getBikePart(rowSet.getInt("bike_part_id"));




        return brake;
    }
}
