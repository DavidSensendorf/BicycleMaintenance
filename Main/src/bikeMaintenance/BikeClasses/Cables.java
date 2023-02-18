package bikeMaintenance.BikeClasses;

import bikeMaintenance.Service.ServiceRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cables {
    private LocalDate installDate;
    private int distanceInMeters;
    private int daysSinceService;
    private int metersSinceService;
    private int ageInterval;
    private int distanceInterval;
    private List<ServiceRecord> serviceRecordList;
    public Cables(LocalDate installDate, int distanceInMeters, int daysSinceService, int metersSinceService, int ageInterval, int distanceInterval) {
        this.installDate = installDate;
        this.distanceInMeters = distanceInMeters;
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

    public LocalDate getInstallDate() {
        return installDate;
    }

    public void setInstallDate(LocalDate installDate) {
        this.installDate = installDate;
    }

    public int getDistanceInMeters() {
        return distanceInMeters;
    }

    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }


}
