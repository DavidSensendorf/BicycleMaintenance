package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.Bicycle;

import java.util.List;

public interface BicycleDao {

    Bicycle getBicycle(int bicycleId);
    List<Bicycle> getAllUserBicycles(int userId);
    Bicycle createBicycle(Bicycle bicycle);
    void updateBicycle(Bicycle updatedBicycle);
    void deleteBicycle(int bicycleId);
}