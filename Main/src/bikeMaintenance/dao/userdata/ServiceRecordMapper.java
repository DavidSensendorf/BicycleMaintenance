package bikemaintenance.dao.userdata;

import bikemaintenance.model.service.ServiceRecord;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceRecordMapper implements RowMapper<ServiceRecord> {
    @Override
    public ServiceRecord mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
