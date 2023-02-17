package bikeMaintenance.BikeClasses;

import java.time.LocalDate;

public class Cassette {
    private int distanceInMeters;
    private LocalDate installDate;
    private int speeds;
    private String modelCommaYear;
    private String size;
    private String gears;
    private int metersSinceService;
    private int daysSinceService;
    private int ageInterval;
    private int distanceInterval;

    public Cassette(int distanceInMeters, LocalDate installDate, int speeds, String modelCommaYear, String size,
                    String gears, int metersSinceService, int daysSinceService, int ageInterval, int distanceInterval) {
        this.distanceInMeters = distanceInMeters;
        this.installDate = installDate;
        this.speeds = speeds;
        this.modelCommaYear = modelCommaYear;
        this.size = size;
        this.gears = gears;
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

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        this.gears = gears;
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

    public int getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int speeds) {
        this.speeds = speeds;
    }

    public String getModelCommaYear() {
        return modelCommaYear;
    }

    public void setModelCommaYear(String modelCommaYear) {
        this.modelCommaYear = modelCommaYear;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
