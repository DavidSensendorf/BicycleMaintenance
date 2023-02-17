package bikeMaintenance.BikeClasses;

import java.time.LocalDate;

public class RimBrakes extends BrakingSystem {

    public RimBrakes(BrakePad brakePad, int distanceInMeters, LocalDate ageInDays, int daysSinceService,
                     int metersSinceService, int ageInterval, int distanceInterval) {
        super(brakePad, distanceInMeters, ageInDays, daysSinceService, metersSinceService, ageInterval, distanceInterval);
    }
}
