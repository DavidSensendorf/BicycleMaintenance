package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Brake;

import java.util.List;

public interface BrakeDao {
    Brake getBrake(int brakeId);
    List<Brake> getAllBicycleBrakes(int bicycleId);
    public List<Brake> getAllBicycleBrakes(int bicycleId, String partType);
    Brake createBrake(Brake brake);
    void updateBicycle(Brake updatedBrake);
    void deleteBrake(int brakeId);

}
