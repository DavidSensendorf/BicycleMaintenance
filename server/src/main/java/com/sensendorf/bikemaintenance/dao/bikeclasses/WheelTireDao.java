package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.WheelTire;

import java.util.List;

public interface WheelTireDao {
    WheelTire getWheelTire(int wheelTireId);
    List<WheelTire> getAllBicycleWheelTires(int wheelTireId);
    List<WheelTire> getAllBicycleWheelTires(int wheelTireId, String partType);
    WheelTire createWheelTire(WheelTire wheelTire);
    boolean updateWheelTire(WheelTire updatedWheelTire);
    boolean deleteWheelTire(int wheelTireId);
}
