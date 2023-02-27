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
        String sql = "INSERT INTO bicycle (name, cyclist_id, description) " +
                "VALUES (?, ?) RETURNING bicycle_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, bicycle.getBicycleName(),
                bicycle.getCyclistId(), bicycle.getDescription());
        return getBicycle(newId);
    }

    @Override
    public void updateBicycle(Bicycle updatedBicycle) {
        String sql = "UPDATE bicycle " +
                "SET name = ?, description = ? " +
                "WHERE bicycle_id = ?";
        jdbcTemplate.update(sql, updatedBicycle.getBicycleName(), updatedBicycle.getDescription(), updatedBicycle.getBicycleId());


    }

    @Override
    public void deleteBicycle(int bicycleId) {
        String sql = "DELETE FROM bicycle WHERE bicycle_id = ?";
        jdbcTemplate.update(sql, bicycleId);
    }

    private Bicycle mapRowToBicycle (SqlRowSet rowSet){
        Bicycle bicycle = new Bicycle();
        bicycle.setBicycleId(rowSet.getInt("bicycle_id"));
        bicycle.setCyclistId(rowSet.getInt("cyclist_id"));
        bicycle.setBicycleName(rowSet.getString("name"));
        bicycle.setDescription(rowSet.getString("description"));
        return bicycle;
    }
}
