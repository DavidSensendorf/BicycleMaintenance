package bikemaintenance.bikeclasses;

import bikemaintenance.service.ServiceRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chain {
    private int distanceInMeters;
    private LocalDate installDate;
    private String modelCommaYear;
    private int speeds;
    private String lubeType;
    private int daysSinceLube;
    private int metersSinceLube;
    private int ageInterval;
    private int distanceInterval;
    private List<ServiceRecord> serviceRecordList;

    public Chain(int distanceInMeters, LocalDate installDate, String modelCommaYear, int speeds, String lubeType,
                 int daysSinceLube, int metersSinceLube, int ageInterval, int distanceInterval) {
        this.distanceInMeters = distanceInMeters;
        this.installDate = installDate;
        this.modelCommaYear = modelCommaYear;
        this.speeds = speeds;
        this.lubeType = lubeType;
        this.daysSinceLube = daysSinceLube;
        this.metersSinceLube = metersSinceLube;
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

    public int getDistanceInMeters() {
        return distanceInMeters;
    }

    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    public LocalDate getInstallDate() {
        return installDate;
    }

    public void setInstallDate(LocalDate installDate) {
        this.installDate = installDate;
    }

    public String getModelCommaYear() {
        return modelCommaYear;
    }

    public void setModelCommaYear(String modelCommaYear) {
        this.modelCommaYear = modelCommaYear;
    }

    public int getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int speeds) {
        this.speeds = speeds;
    }

    public String getLubeType() {
        return lubeType;
    }

    public void setLubeType(String lubeType) {
        this.lubeType = lubeType;
    }

    public int getDaysSinceLube() {
        return daysSinceLube;
    }

    public void setDaysSinceLube(int daysSinceLube) {
        this.daysSinceLube = daysSinceLube;
    }

    public int getMetersSinceLube() {
        return metersSinceLube;
    }

    public void setMetersSinceLube(int metersSinceLube) {
        this.metersSinceLube = metersSinceLube;
    }
}
