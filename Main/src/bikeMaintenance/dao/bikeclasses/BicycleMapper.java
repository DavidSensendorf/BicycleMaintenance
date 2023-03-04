package bikemaintenance.dao.bikeclasses;

import bikemaintenance.model.bikeclasses.Bicycle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BicycleMapper implements RowMapper<Bicycle> {
    @Override
    public Bicycle mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
