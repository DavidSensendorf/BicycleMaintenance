package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.BikePart;

import java.util.List;

public interface BikePartDao {
    BikePart getBikePart(int partId);
    List<BikePart> getAllBicycleBikeParts(int bicycleId);
    List<BikePart> getAllBicycleBikeParts(int bicycleId, String partType);
    BikePart createBikePart(BikePart bikePart);
    boolean updateBikePart(BikePart updatedBikePart);
    boolean deleteBikePart(int partId);
}
