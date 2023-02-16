package bikeMaintenance.BikeClasses;

public class BrakePad {
    private int distanceInMeters;
    private int ageInDays;
    private String padType;
    private int metersSinceService;
    private int daysSinceService;

    public BrakePad(int distanceInMeters, int ageInDays, String padType, int metersSinceService, int daysSinceService) {
        this.distanceInMeters = distanceInMeters;
        this.ageInDays = ageInDays;
        this.padType = padType;
        this.metersSinceService = metersSinceService;
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
