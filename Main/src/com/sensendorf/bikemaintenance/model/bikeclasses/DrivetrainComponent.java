package com.sensendorf.bikemaintenance.model.bikeclasses;

import com.sensendorf.bikemaintenance.model.service.ServiceRecord;

import java.time.LocalDate;
import java.util.List;

public class DrivetrainComponent extends BikePart{
    private int speeds;
    private String gearSize;
    private String lubeType;
    private boolean isWaxed;

    public DrivetrainComponent(int bikePartId, int bicycleId, String name, String description, String manufacturer, String model, int modelYear, String partType, LocalDate installDate, int distanceInMeters, int ageInterval, int distanceInterval, List<ServiceRecord> serviceRecordList, String material, String style, int speeds, String gearSize, String lubeType, boolean isWaxed) {
        super(bikePartId, bicycleId, name, description, manufacturer, model, modelYear, partType, installDate, distanceInMeters, ageInterval, distanceInterval, serviceRecordList, material, style);
        this.speeds = speeds;
        this.gearSize = gearSize;
        this.lubeType = lubeType;
        this.isWaxed = isWaxed;
    }

    public DrivetrainComponent() {

    }

    public int getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int speeds) {
        this.speeds = speeds;
    }

    public String getGearSize() {
        return gearSize;
    }

    public void setGearSize(String gearSize) {
        this.gearSize = gearSize;
    }

    public String getLubeType() {
        return lubeType;
    }

    public void setLubeType(String lubeType) {
        this.lubeType = lubeType;
    }

    public boolean isWaxed() {
        return isWaxed;
    }

    public void setWaxed(boolean waxed) {
        isWaxed = waxed;
    }
}
