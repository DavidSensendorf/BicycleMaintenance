package bikeMaintenance.BikeClasses;

import java.time.LocalDate;

public class Tire {
    private String modelCommaYear;
    private int distanceInMeters;
    private LocalDate installDate;
    private String size;
    private String type;
    private int sealantAgeInDays;
    private boolean isTubeless;
    private int daysSinceService;
    private int metersSinceService;
    private int ageInterval;
    private int distanceInterval;

    public Tire(String modelCommaYear, int distanceInMeters, LocalDate installDate, String size, String type,
                int sealantAgeInDays, boolean isTubeless, int daysSinceService, int metersSinceService, int ageInterval,
                int distanceInterval) {
        this.modelCommaYear = modelCommaYear;
        this.distanceInMeters = distanceInMeters;
        this.installDate = installDate;
        this.size = size;
        this.type = type;
        this.sealantAgeInDays = sealantAgeInDays;
        this.isTubeless = isTubeless;
        this.daysSinceService = daysSinceService;
        this.metersSinceService = metersSinceService;
        this.ageInterval = ageInterval;
        this.distanceInterval = distanceInterval;
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

    public String getModelCommaYear() {
        return modelCommaYear;
    }

    public void setModelCommaYear(String modelCommaYear) {
        this.modelCommaYear = modelCommaYear;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSealantAgeInDays() {
        return sealantAgeInDays;
    }

    public void setSealantAgeInDays(int sealantAgeInDays) {
        this.sealantAgeInDays = sealantAgeInDays;
    }

    public boolean isTubeless() {
        return isTubeless;
    }

    public void setTubeless(boolean tubeless) {
        isTubeless = tubeless;
    }
}
