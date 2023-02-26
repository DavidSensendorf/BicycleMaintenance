package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.BikePart;

import java.util.List;

public class JdbcBikePartDao implements BikePartDao{
    @Override
    public BikePart getBikePart(int partId) {
        return null;
    }

    @Override
    public List<BikePart> getAllUserBikeParts(int userId) {
        return null;
    }

    @Override
    public BikePart createBikePart(BikePart bikePart) {
        return null;
    }

    @Override
    public void updateBikePart(BikePart updatedBikePart) {

    }

    @Override
    public void deleteBikePart(int partId) {

    }
}
