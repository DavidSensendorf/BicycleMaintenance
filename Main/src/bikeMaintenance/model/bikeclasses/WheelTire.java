package bikemaintenance.model.bikeclasses;

import bikemaintenance.model.service.ServiceRecord;

import java.time.LocalDate;
import java.util.List;

public class WheelTire extends BikePart{
    public WheelTire(int bikePartId, int bicycleId, String name, String description, String manufacturer, String model, int modelYear, String partType, LocalDate installDate, int distanceInMeters, int ageInterval, int distanceInterval, List<ServiceRecord> serviceRecordList, String material, String style, boolean isTubeless, boolean isFront) {
        super(bikePartId, bicycleId, name, description, manufacturer, model, modelYear, partType, installDate, distanceInMeters, ageInterval, distanceInterval, serviceRecordList, material, style);
        this.isTubeless = isTubeless;
        this.isFront = isFront;
    }

    private boolean isTubeless;
    private boolean isFront;

    public boolean isTubeless() {
        return isTubeless;
    }

    public void setTubeless(boolean tubeless) {
        isTubeless = tubeless;
    }

    public boolean isFront() {
        return isFront;
    }

    public void setFront(boolean front) {
        isFront = front;
    }

}
