package bikeMaintenance.BikeClasses;

public abstract class BrakingSystem {
    private BrakePad brakePad;
    private int distanceInMeters;
    private int ageInDays;
    private int daysSinceService;
    private int metersSinceService;

    public BrakingSystem(BrakePad brakePad, int distanceInMeters, int ageInDays, int daysSinceService, int metersSinceService) {
        this.brakePad = brakePad;
        this.distanceInMeters = distanceInMeters;
        this.ageInDays = ageInDays;
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

    public BrakePad getBrakePad() {
        return brakePad;
    }

    public void setBrakePad(BrakePad brakePad) {
        this.brakePad = brakePad;
    }

    public int getDistanceInMeters() {
        return distanceInMeters;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }
}
