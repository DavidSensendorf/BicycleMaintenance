package bikeMaintenance.BikeClasses;

import java.time.LocalDate;

public class DiscBrakes extends BrakingSystem {

    private String discModelCommaYear;

    public DiscBrakes(BrakePad brakePad, int distanceInMeters, LocalDate ageInDays, int daysSinceService,
                      int metersSinceService, int ageInterval, int distanceInterval, String discModelCommaYear) {
        super(brakePad, distanceInMeters, ageInDays, daysSinceService, metersSinceService, ageInterval, distanceInterval);
        this.discModelCommaYear = discModelCommaYear;
    }

    public String getDiscModelCommaYear() {
        return discModelCommaYear;
    }

    public void setDiscModelCommaYear(String discModelCommaYear) {
        this.discModelCommaYear = discModelCommaYear;
    }
}
