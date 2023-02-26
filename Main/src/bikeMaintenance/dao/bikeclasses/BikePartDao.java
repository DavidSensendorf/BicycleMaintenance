package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.BikePart;

import java.util.List;

public interface BikePartDao {
    BikePart getBikePart(int partId);
    List<BikePart> getAllUserBikeParts(int userId);
    BikePart createBikePart(BikePart bikePart);
    void updateBikePart(BikePart updatedBikePart);
    void deleteBikePart(int partId);
}
