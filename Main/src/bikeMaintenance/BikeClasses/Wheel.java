package bikeMaintenance.BikeClasses;

public class Wheel {
    private String modelCommaYear;
    private int distanceInMeters;
    private int ageInDays;
    private String size;
    private String material;
    private int metersSinceService;
    private int daysSinceService;

    public Wheel(String modelCommaYear, int distanceInMeters, int ageInDays, String size, String material, int metersSinceService, int daysSinceService) {
        this.modelCommaYear = modelCommaYear;
        this.distanceInMeters = distanceInMeters;
        this.ageInDays = ageInDays;
        this.size = size;
        this.material = material;
        this.metersSinceService = metersSinceService;
        this.daysSinceService = daysSinceService;
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
