package bikeMaintenance.BikeClasses;

import java.time.LocalDate;

public abstract class BrakingSystem {
    private BrakePad brakePad;
    private int distanceInMeters;
    private LocalDate installDate;
    private int daysSinceService;
    private int metersSinceService;
    private int ageInterval;
    private int distanceInterval;

    public BrakingSystem(BrakePad brakePad, int distanceInMeters, LocalDate installDate, int daysSinceService, int metersSinceService, int ageInterval, int distanceInterval) {
        this.brakePad = brakePad;
        this.distanceInMeters = distanceInMeters;
        this.installDate = installDate;
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
