package bikeMaintenance.BikeClasses;

public class RimBrakes extends BrakingSystem {
    public RimBrakes(BrakePad brakePad, int distanceInMeters, int ageInDays, int daysSinceService, int metersSinceService) {
        super(brakePad, distanceInMeters, ageInDays, daysSinceService, metersSinceService);
    }
}
