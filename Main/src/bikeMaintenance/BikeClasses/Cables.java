package bikeMaintenance.BikeClasses;

public class Cables {
    private int ageInDays;
    private int distanceInMeters;
    private int daysSinceService;
    private int metersSinceService;

    public Cables(int ageInDays, int distanceInMeters, int daysSinceService, int metersSinceService) {
        this.ageInDays = ageInDays;
        this.distanceInMeters = distanceInMeters;
        this.daysSinceService = daysSinceService;
        this.metersSinceService = metersSinceService;
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


}
