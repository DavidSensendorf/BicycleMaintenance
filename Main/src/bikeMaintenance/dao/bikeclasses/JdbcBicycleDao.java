package bikemaintenance.dao.bikeclasses;

import bikemaintenance.model.bikeclasses.Bicycle;
import org.junit.jupiter.api.TestClassOrder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDateTime;
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
                     "WHERE bicycleId = ? AND active = true;";
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
                "WHERE cyclist_id = ? AND active = true;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        while (results.next()){
            bicycleList.add(mapRowToBicycle(results));
        }
        return bicycleList;
    }

    @Override
    public Bicycle createBicycle(Bicycle bicycle) {
        String sql = "INSERT INTO bicycle (name, cyclist_id, description, active) " +
                "VALUES (?, ? ?, true) RETURNING bicycle_id;";
        Integer newId = jdbcTemplate.queryForObject(sql, Integer.class, bicycle.getBicycleName(),
                bicycle.getCyclistId(), bicycle.getDescription());
        return getBicycle(newId);
    }

    @Override
    public void updateBicycle(Bicycle updatedBicycle) {
        String sql = "UPDATE bicycle " +
                "SET name = ?, description = ? " +
                "WHERE bicycle_id = ? AND active = true;";
        jdbcTemplate.update(sql, updatedBicycle.getBicycleName(), updatedBicycle.getDescription(), updatedBicycle.getBicycleId());


    }

    @Override
    /* TODO:  Some kind of logic to deal with orphan bike parts later on?*/
    public void deleteBicycle(int bicycleId) {
        String sql = "UPDATE bicycle" +
                "SET active = false, date_deleted = ?" +
                "WHERE bicycle_id = ?;";
        jdbcTemplate.update(sql, LocalDateTime.now(), bicycleId);
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
