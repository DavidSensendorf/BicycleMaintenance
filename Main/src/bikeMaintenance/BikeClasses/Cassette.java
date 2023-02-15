package bikeMaintenance.BikeClasses;

public class Cassette {
    private int distanceInMeters;
    private int ageInDays;
    private int speeds;
    private String modelCommaYear;
    private String size;
    private String gears;
    private int metersSinceService;
    private int daysSinceService;

    public Cassette() {
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

    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
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
