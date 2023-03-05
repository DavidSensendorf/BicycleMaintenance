package com.sensendorf.bikemaintenance.dao.userdata;

import com.sensendorf.bikemaintenance.model.userdata.Cyclist;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CyclistMapper implements RowMapper<Cyclist> {
    @Override
    public Cyclist mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
