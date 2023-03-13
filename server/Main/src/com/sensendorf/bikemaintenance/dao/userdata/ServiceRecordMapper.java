package com.sensendorf.bikemaintenance.dao.userdata;

import com.sensendorf.bikemaintenance.model.service.ServiceRecord;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceRecordMapper implements RowMapper<ServiceRecord> {
    @Override
    public ServiceRecord mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
