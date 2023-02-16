package bikeMaintenance.BikeClasses;

public class Derailleur {
    private String model;
    private int year;
    private int ageInDays;
    private int distanceInMeters;
    private int daysSinceService;
    private int metersSinceService;

    public Derailleur(String model, int year, int ageInDays, int distanceInMeters, int daysSinceService, int metersSinceService) {
        this.model = model;
        this.year = year;
        this.ageInDays = ageInDays;
        this.distanceInMeters = distanceInMeters;
        this.daysSinceService = daysSinceService;
        this.metersSinceService = metersSinceService;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
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
