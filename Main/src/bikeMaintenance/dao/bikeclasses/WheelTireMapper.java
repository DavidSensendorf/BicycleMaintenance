package bikemaintenance.dao.bikeclasses;

import bikemaintenance.model.bikeclasses.WheelTire;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WheelTireMapper implements RowMapper<WheelTire> {
    @Override
    public WheelTire mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
