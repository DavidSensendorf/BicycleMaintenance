package bikemaintenance.dao.bikeclasses;

import bikemaintenance.model.bikeclasses.DrivetrainComponent;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DrivetrainComponentMapper implements RowMapper<DrivetrainComponent> {
    @Override
    public DrivetrainComponent mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
