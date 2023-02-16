package bikeMaintenance.BikeClasses;

public class DiscBrakes extends BrakingSystem {

    private String discModelCommaYear;

    public DiscBrakes(BrakePad brakePad, int distanceInMeters, int ageInDays, int daysSinceService, int metersSinceService, String discModelCommaYear) {
        super(brakePad, distanceInMeters, ageInDays, daysSinceService, metersSinceService);
        this.discModelCommaYear = discModelCommaYear;
    }

    public String getDiscModelCommaYear() {
        return discModelCommaYear;
    }

    public void setDiscModelCommaYear(String discModelCommaYear) {
        this.discModelCommaYear = discModelCommaYear;
    }
}
