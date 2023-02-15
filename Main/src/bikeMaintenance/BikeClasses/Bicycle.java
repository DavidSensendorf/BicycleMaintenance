package bikeMaintenance.BikeClasses;

import java.util.HashMap;
import java.util.Map;

public class Bicycle {
    private int metersSinceService;
    private int daysSinceService;
    private String name;
    private String type;
    private String manufacturer;
    private String modelCommaYear;
    private int ageInDays;
    private int distanceInMeters;
    private Map<String, Object> bikePartsList = new HashMap<>();

    public Bicycle() {
    }

    public Map<String, Object> getBikePartsList() {
        return bikePartsList;
    }

    public void setBikePartsList(Map<String, Object> bikePartsList) {
        this.bikePartsList = bikePartsList;
    }

    public int getMetersSinceService() {
        return metersSinceService;
    }

    public void setMetersSinceService(int metersSinceService) {
        this.metersSinceService = metersSinceService;
    }

    public int getDaysSinceService() {
        return daysSinceService;
    }

    public void setDaysSinceService(int daysSinceService) {
        this.daysSinceService = daysSinceService;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelCommaYear() {
        return modelCommaYear;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public int getDistanceInMeters() {
        return distanceInMeters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModelCommaYear(String modelCommaYear) {
        this.modelCommaYear = modelCommaYear;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

}