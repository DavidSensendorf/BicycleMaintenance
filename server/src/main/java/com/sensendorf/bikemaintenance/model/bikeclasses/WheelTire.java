package com.sensendorf.bikemaintenance.model.bikeclasses;

import java.time.LocalDate;

public class WheelTire extends BikePart{
    public WheelTire(int bikePartId, int bicycleId, String name, String description, String manufacturer, String model, int modelYear, String partType, LocalDate installDate, int distanceInMeters, int ageInterval, int distanceInterval, String material, String style, boolean isTubeless, boolean isFront) {
        super(bikePartId, bicycleId, name, description, manufacturer, model, modelYear, partType, installDate, distanceInMeters, ageInterval, distanceInterval, material, style);
        this.isTubeless = isTubeless;
        this.isFront = isFront;
    }

    public WheelTire(boolean isTubeless, boolean isFront) {
        this.isTubeless = isTubeless;
        this.isFront = isFront;
    }

    private boolean isTubeless;
    private boolean isFront;

    public WheelTire() {

    }

    public boolean isTubeless() {
        return isTubeless;
    }

    public void setTubeless(boolean tubeless) {
        isTubeless = tubeless;
    }

    public boolean isFront() {
        return isFront;
    }

    public void setFront(boolean front) {
        isFront = front;
    }

}
