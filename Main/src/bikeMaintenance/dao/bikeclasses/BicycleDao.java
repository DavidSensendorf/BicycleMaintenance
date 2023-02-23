package bikemaintenance.dao.bikeclasses;

import bikemaintenance.userdata.Bicycle;

import java.util.List;

public interface BicycleDao {

    public Bicycle getBicycle(int bicycleId);
    public List<Bicycle> getAllUserBicycles(int userId);
    public Bicycle createBicycle(Bicycle bicycle);
    public void updateBicycle(Bicycle updatedBicycle);
    public void deleteBicycle(int bicycleId);
}
