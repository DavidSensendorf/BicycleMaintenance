package bikemaintenance.bikeclasses;

import bikemaintenance.service.ServiceRecord;

import java.time.LocalDate;
import java.util.List;

public class BikePart {
    private int bikePartId;
    private int bicycleId;
    private String name;
    private String description;
    private String manufacturer;
    private String model;
    private int modelYear;
    private String partType;
    private LocalDate installDate;
    private int distanceInMeters;
    private int daysSinceService;
    private int metersSinceService;
    private int ageInterval;
    private int distanceInterval;
    private List<ServiceRecord> serviceRecordList;
    private String padType;
    private int speeds;
    private String size;
    private String lubeType;
    private int daysSinceLube;
    private int metersSinceLube;
    private boolean isWaxed;
    private boolean isElectric;
    private String style;
    private boolean isTubeless;
    private boolean isFront;
    private String material;
    private int sealantAgeInDays;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPadType() {
        return padType;
    }

    public void setPadType(String padType) {
        this.padType = padType;
    }

    public int getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int speeds) {
        this.speeds = speeds;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public boolean isWaxed() {
        return isWaxed;
    }

    public void setWaxed(boolean waxed) {
        isWaxed = waxed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSealantAgeInDays() {
        return sealantAgeInDays;
    }

    public void setSealantAgeInDays(int sealantAgeInDays) {
        this.sealantAgeInDays = sealantAgeInDays;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getBikePartId() {
        return bikePartId;
    }

    public void setBikePartId(int bikePartId) {
        this.bikePartId = bikePartId;
    }

    public int getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(int bicycleId) {
        this.bicycleId = bicycleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getInstallDate() {
        return installDate;
    }

    public void setInstallDate(LocalDate installDate) {
        this.installDate = installDate;
    }

    public int getDistanceInMeters() {
        return distanceInMeters;
    }

    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
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

    public int getAgeInterval() {
        return ageInterval;
    }

    public void setAgeInterval(int ageInterval) {
        this.ageInterval = ageInterval;
    }

    public int getDistanceInterval() {
        return distanceInterval;
    }

    public void setDistanceInterval(int distanceInterval) {
        this.distanceInterval = distanceInterval;
    }

    public List<ServiceRecord> getServiceRecordList() {
        return serviceRecordList;
    }

    public void setServiceRecordList(List<ServiceRecord> serviceRecordList) {
        this.serviceRecordList = serviceRecordList;
    }
}
