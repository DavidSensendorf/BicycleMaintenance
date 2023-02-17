package bikeMaintenance.BikeClasses;

import java.time.LocalDate;

public class BrakePad {
    private int distanceInMeters;
    private int ageInDays;
    private String padType;
    private int metersSinceService;
    private int daysSinceService;
    private LocalDate installDate;
    private int distanceInterval;

    public BrakePad(int distanceInMeters, int ageInDays, String padType, int metersSinceService, int daysSinceService,
                    LocalDate installDate, int distanceInterval) {
        this.distanceInMeters = distanceInMeters;
        this.ageInDays = ageInDays;
        this.padType = padType;
        this.metersSinceService = metersSinceService;
        this.daysSinceService = daysSinceService;
        this.installDate = installDate;
        this.distanceInterval = distanceInterval;
    }

    public LocalDate getInstallDate() {
        return installDate;
    }

    public void setInstallDate(LocalDate installDate) {
        this.installDate = installDate;
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

    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    public String getPadType() {
        return padType;
    }

    public void setPadType(String padType) {
        this.padType = padType;
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

}
