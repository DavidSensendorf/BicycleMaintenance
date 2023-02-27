package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.BikePart;

import java.util.List;

public interface BikePartDao {
    BikePart getBikePart(int partId);
    List<BikePart> getAllBicycleBikeParts(int bicycleId);
    BikePart createBikePart(BikePart bikePart);
    void updateBikePart(BikePart updatedBikePart);
    void deleteBikePart(int partId);
}
