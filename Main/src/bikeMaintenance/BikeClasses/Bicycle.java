package bikeMaintenance.BikeClasses;

import bikeMaintenance.DataStorageRetrieval.SQL;

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
    private Map<Integer, Object> bikeServiceList = new HashMap<>();

    public Bicycle(int metersSinceService, int daysSinceService, String name, String type, String manufacturer,
                   String modelCommaYear, int ageInDays, int distanceInMeters, Map<String, Object> bikePartsList,
                   Map<Integer, Object> bikeServiceList) {
        this.metersSinceService = metersSinceService;
        this.daysSinceService = daysSinceService;
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.modelCommaYear = modelCommaYear;
        this.ageInDays = ageInDays;
        this.distanceInMeters = distanceInMeters;
        this.bikePartsList = bikePartsList;
        this.bikeServiceList = bikeServiceList;
    }

    public Map<Integer, Object> getBikeServiceList() {
        return bikeServiceList;
    }

    public void setBikeServiceList(Map<Integer, Object> bikeServiceList) {
        this.bikeServiceList = bikeServiceList;
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