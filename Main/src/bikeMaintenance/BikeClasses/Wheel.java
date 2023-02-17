package bikeMaintenance.BikeClasses;

import java.time.LocalDate;

public class Wheel {
    private String modelCommaYear;
    private int distanceInMeters;
    private LocalDate installDate;
    private String size;
    private String material;
    private int metersSinceService;
    private int daysSinceService;
    private int ageInterval;
    private int distanceInterval;

    public Wheel(String modelCommaYear, int distanceInMeters, LocalDate installDate, String size, String material,
                 int metersSinceService, int daysSinceService, int ageInterval, int distanceInterval) {
        this.modelCommaYear = modelCommaYear;
        this.distanceInMeters = distanceInMeters;
        this.installDate = installDate;
        this.size = size;
        this.material = material;
        this.metersSinceService = metersSinceService;
        this.daysSinceService = daysSinceService;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
