package bikeMaintenance.BikeClasses;

public class Chainring {
    private int distanceInMeters;
    private int ageInDays;
    private String size;
    private String modelCommaYear;
    private int speeds;
    private int daysSinceService;
    private int metersSinceService;

    public Chainring() {

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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


}
