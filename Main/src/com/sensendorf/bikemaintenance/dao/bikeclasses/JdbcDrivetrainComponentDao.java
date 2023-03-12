package com.sensendorf.bikemaintenance.dao.bikeclasses;

import com.sensendorf.bikemaintenance.model.bikeclasses.DrivetrainComponent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
    public boolean updateDrivetrainComponent(DrivetrainComponent updatedDrivetrainComponent) {
        return true;
    }

    @Override
    public boolean deleteDrivetrainComponent(int drivetrainComponentId) {
        return true;
    }
}
