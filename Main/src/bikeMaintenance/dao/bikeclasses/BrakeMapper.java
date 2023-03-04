package bikemaintenance.dao.bikeclasses;

import bikemaintenance.model.bikeclasses.Brake;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BrakeMapper implements RowMapper<Brake> {
    @Override
    public Brake mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
