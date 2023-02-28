package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.DrivetrainComponent;

import java.util.List;

public class JdbcDrivetrainComponentDao implements DrivetrainComponentDao{
    @Override
    public DrivetrainComponent getDrivetrainComponent(int drivetrainComponentId) {
        return null;
    }

    @Override
    public List<DrivetrainComponent> getAllBicycleDrivetrainComponents(int bicycleId) {
        return null;
    }

    @Override
    public List<DrivetrainComponent> getAllBicycleDrivetrainComponents(int bicycleId, String partType) {
        return null;
    }

    @Override
    public DrivetrainComponent createDrivetrainComponent(DrivetrainComponent drivetrainComponent) {
        return null;
    }

    @Override
    public void updateDrivetrainComponent(DrivetrainComponent updatedDrivetrainComponent) {

    }

    @Override
    public void deleteDrivetrainComponent(int drivetrainComponentId) {

    }
}
