package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Bicycle;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcBicycleDao implements BicycleDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcBicycleDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Bicycle getBicycle(int bicycleId) {
        Bicycle bicycle = null;
        String sql = "Select * " +
                     "FROM bicycle" +
                     "WHERE bicycleId = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, bicycleId);
        if (results.next()) {
            bicycle = mapRowToBicycle(results);
        }
        return bicycle;
    }

    @Override
    public List<Bicycle> getAllUserBicycles(int userId) {
        List<Bicycle> bicycleList = new ArrayList<>();
        String sql = "SELECT * " +
                "FROM bicycle " +
                "WHERE cyclist_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        while (results.next()){
            bicycleList.add(mapRowToBicycle(results));
        }
        return bicycleList;
    }

    @Override
    public Bicycle createBicycle(Bicycle bicycle) {
        String sql = "INSERT INTO bicycle (name, bicycle_frame_id, cyclist_id) " +
                "VALUES (?, ?, ?) RETURNING bicycle_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, bicycle.getBicycleName(),
                bicycle.getBicycleFrameId(), bicycle.getCyclistId());
        return getBicycle(newId);
    }

    @Override
    public void updateBicycle(Bicycle updatedBicycle) {


    }

    @Override
    public void deleteBicycle(int bicycleId) {

    }

    private Bicycle mapRowToBicycle (SqlRowSet rowSet){
        Bicycle bicycle = new Bicycle();
        bicycle.setBicycleFrameId(rowSet.getInt("bicycle_frame_id"));
        bicycle.setBicycleId(rowSet.getInt("bicycle_id"));
        bicycle.setBicycleName(rowSet.getString("name"));
        return bicycle;
    }
}
