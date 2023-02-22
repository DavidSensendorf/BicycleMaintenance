package bikemaintenance.bikeclasses;

import bikemaintenance.service.ServiceRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class BrakingSystem {
    private int brakesId;
    private BrakePad brakePad;
    private int distanceInMeters;
    private LocalDate installDate;
    private int daysSinceService;
    private int metersSinceService;
    private int ageInterval;
    private int distanceInterval;
    private List<ServiceRecord> serviceRecordList;
    private String name;
    private int bicycleId;

    public int getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(int bicycleId) {
        this.bicycleId = bicycleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BrakingSystem(BrakePad brakePad, int distanceInMeters, LocalDate installDate, int daysSinceService, int metersSinceService, int ageInterval, int distanceInterval) {
        this.brakePad = brakePad;
        this.distanceInMeters = distanceInMeters;
        this.installDate = installDate;
        this.daysSinceService = daysSinceService;
        this.metersSinceService = metersSinceService;
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

    public int getBrakesId() {
        return brakesId;
    }

    public void setBrakesId(int brakesId) {
        this.brakesId = brakesId;
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

    public int getDaysSinceService() {
        return daysSinceService;
    }
    public void setDaysSinceService(int daysSinceService) {
        this.daysSinceService = daysSinceService;
    }

    public int getMetersSinceService() {
        return metersSinceService;
    }

    public void setMetersSinceService(int metersSinceService) {
        this.metersSinceService = metersSinceService;
    }

    public BrakePad getBrakePad() {
        return brakePad;
    }

    public void setBrakePad(BrakePad brakePad) {
        this.brakePad = brakePad;
    }

    public int getDistanceInMeters() {
        return distanceInMeters;
    }

    public LocalDate getInstallDate() {
        return installDate;
    }

    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    public void setInstallDate(LocalDate installDate) {
        this.installDate = installDate;
    }
}
