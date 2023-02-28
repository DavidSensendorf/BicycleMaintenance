package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Brake;

import java.util.List;

public class JdbcBrakeDao implements BrakeDao {
    @Override
    public Brake getBrake(int brakeId) {
        return null;
    }

    @Override
    public List<Brake> getAllBicycleBrakes(int bicycleId) {
        return null;
    }

    @Override
    public List<Brake> getAllBicycleBrakes(int bicycleId, String partType) {
        return null;
    }

    @Override
    public Brake createBrake(Brake brake) {
        return null;
    }

    @Override
    public void updateBicycle(Brake updatedBrake) {

    }

    @Override
    public void deleteBrake(int brakeId) {

    }
}
