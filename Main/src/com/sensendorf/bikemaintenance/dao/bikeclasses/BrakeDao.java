package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.Brake;

import java.util.List;

public interface BrakeDao {
    Brake getBrake(int brakeId);
    List<Brake> getAllBicycleBrakes(int bicycleId);
    public List<Brake> getAllBicycleBrakes(int bicycleId, String partType);
    Brake createBrake(Brake brake);
    boolean updateBrake(Brake updatedBrake);
    boolean deleteBrake(int brakeId);

}
