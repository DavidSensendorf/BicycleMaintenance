package bikeMaintenance.BikeClasses;

import java.time.LocalDate;

public class Derailleur {
    private String model;
    private int year;
    private LocalDate installDate;
    private int distanceInMeters;
    private int daysSinceService;
    private int metersSinceService;
    private int ageInterval;
    private int distanceInterval;

    public Derailleur(String model, int year, LocalDate installDate, int distanceInMeters, int daysSinceService,
                      int metersSinceService, int ageInterval, int distanceInterval) {
        this.model = model;
        this.year = year;
        this.installDate = installDate;
        this.distanceInMeters = distanceInMeters;
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

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }





}
