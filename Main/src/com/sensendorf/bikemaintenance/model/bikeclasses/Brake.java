package com.sensendorf.bikemaintenance.model.bikeclasses;

import com.sensendorf.bikemaintenance.model.service.ServiceRecord;

import java.time.LocalDate;
import java.util.List;

public class Brake extends BikePart{
    private String padType;
    private boolean isFront;

    public Brake(int bikePartId, int bicycleId, String name, String description, String manufacturer, String model,
                 int modelYear, String partType, LocalDate installDate, int distanceInMeters, int ageInterval,
                 int distanceInterval, List<ServiceRecord> serviceRecordList, String material, String style, String padType,
                 boolean isFront) {
        super(bikePartId, bicycleId, name, description, manufacturer, model, modelYear, partType, installDate,
                distanceInMeters, ageInterval, distanceInterval, serviceRecordList, material, style);
        this.padType = padType;
        this.isFront = isFront;
    }

    public Brake() {

    }

    public String getPadType() {
        return padType;
    }

    public void setPadType(String padType) {
        this.padType = padType;
    }

    public boolean isFront() {
        return isFront;
    }

    public void setFront(boolean front) {
        isFront = front;
    }
}
