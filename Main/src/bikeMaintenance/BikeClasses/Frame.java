package bikeMaintenance.BikeClasses;

import bikeMaintenance.Service.ServiceRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Frame {
    private int metersSinceService;
    private int daysSinceService;
    private String name;
    private String type;
    private String manufacturer;
    private String modelCommaYear;
    private LocalDate installDate;
    private int distanceInMeters;
    private int ageInterval;
    private int distanceInterval;
    private List<ServiceRecord> serviceRecordList;
    public Frame(int metersSinceService, int daysSinceService, String name, String type, String manufacturer,
                 String modelCommaYear, LocalDate installDate, int distanceInMeters, int ageInterval,
                 int distanceInterval) {
        this.metersSinceService = metersSinceService;
        this.daysSinceService = daysSinceService;
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.modelCommaYear = modelCommaYear;
        this.installDate = installDate;
        this.distanceInMeters = distanceInMeters;
        this.ageInterval = ageInterval;
        this.distanceInterval = distanceInterval;
        this.serviceRecordList = new ArrayList<>();
    }

    public List<ServiceRecord> getServiceRecordList() {
        return serviceRecordList;
    }

    public void setServiceRecordList(List<ServiceRecord> serviceRecordList) {
        this.serviceRecordList = serviceRecordList;
    }

    public int getAgeInterval() {
        return ageInterval;
    }

    public void setAgeInterval(int ageInterval) {
        this.ageInterval = ageInterval;
    }

    public int getDistanceInterval() {
        return distanceInterval;
    }

    public void setDistanceInterval(int distanceInterval) {
        this.distanceInterval = distanceInterval;
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

    public LocalDate getInstallDate() {
        return installDate;
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

    public void setInstallDate(LocalDate installDate) {
        this.installDate = installDate;
    }

    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

}