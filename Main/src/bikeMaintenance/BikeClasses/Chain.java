package bikeMaintenance.BikeClasses;

public class Chain {
    private int distanceInMeters;
    private int ageInDays;
    private String modelCommaYear;
    private int speeds;
    private String lubeType;
    private int daysSinceLube;
    private int metersSinceLube;

    public Chain() {

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

    public String getLubeType() {
        return lubeType;
    }

    public void setLubeType(String lubeType) {
        this.lubeType = lubeType;
    }

    public int getDaysSinceLube() {
        return daysSinceLube;
    }

    public void setDaysSinceLube(int daysSinceLube) {
        this.daysSinceLube = daysSinceLube;
    }

    public int getMetersSinceLube() {
        return metersSinceLube;
    }

    public void setMetersSinceLube(int metersSinceLube) {
        this.metersSinceLube = metersSinceLube;
    }
}
