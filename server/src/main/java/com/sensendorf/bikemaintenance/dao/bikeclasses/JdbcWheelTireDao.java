package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.WheelTire;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcWheelTireDao implements WheelTireDao{
    @Override
    public WheelTire getWheelTire(int wheelTireId) {
        return null;
    }

    @Override
    public List<WheelTire> getAllBicycleWheelTires(int wheelTireId) {
        return null;
    }

    @Override
    public List<WheelTire> getAllBicycleWheelTires(int wheelTireId, String partType) {
        return null;
    }

    @Override
    public WheelTire createWheelTire(WheelTire wheelTire) {
        return null;
    }

    @Override
    public boolean updateWheelTire(WheelTire updatedWheelTire) {
        return true;
    }

    @Override
    public boolean deleteWheelTire(int wheelTireId) {
        return true;
    }
}
