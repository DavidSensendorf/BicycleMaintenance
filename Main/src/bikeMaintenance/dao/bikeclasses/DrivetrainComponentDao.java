package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.DrivetrainComponent;

import java.util.List;

public interface DrivetrainComponentDao {
    DrivetrainComponent getDrivetrainComponent(int drivetrainComponentId);
    List<DrivetrainComponent> getAllBicycleDrivetrainComponents(int bicycleId);
    List<DrivetrainComponent> getAllBicycleDrivetrainComponents(int bicycleId, String partType);
    DrivetrainComponent createDrivetrainComponent(DrivetrainComponent drivetrainComponent);
    void updateDrivetrainComponent(DrivetrainComponent updatedDrivetrainComponent);
    void deleteDrivetrainComponent(int drivetrainComponentId);
}
