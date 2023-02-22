package bikemaintenance.dao.bikeclasses;

import bikemaintenance.userdata.Bicycle;

import java.util.List;

public interface BicycleDao {

    Bicycle getBicycle(int bicycleId);
    List<Bicycle> getAllUserBicycles(int userId);
    Bicycle createBicycle(Bicycle bicycle);
    void updateBicycle(Bicycle bicycle);
    void deleteBicycle(int bicycleId);
}
