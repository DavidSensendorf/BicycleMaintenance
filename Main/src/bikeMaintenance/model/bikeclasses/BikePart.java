package bikemaintenance.model.bikeclasses;

import bikemaintenance.model.service.ServiceRecord;

import java.time.LocalDate;
import java.util.List;

public class BikePart {
    public BikePart(int bikePartId, int bicycleId, String name, String description, String manufacturer, String model,
                    int modelYear, String partType, LocalDate installDate, int distanceInMeters, int ageInterval,
                    int distanceInterval, List<ServiceRecord> serviceRecordList, String material, String style) {
        this.bikePartId = bikePartId;
        this.bicycleId = bicycleId;
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.model = model;
        this.modelYear = modelYear;
        this.partType = partType;
        this.installDate = installDate;
        this.distanceInMeters = distanceInMeters;
        this.ageInterval = ageInterval;
        this.distanceInterval = distanceInterval;
        this.serviceRecordList = serviceRecordList;
        this.material = material;
        this.style = style;
    }


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
    private int ageInterval;
    private int distanceInterval;
    private List<ServiceRecord> serviceRecordList;
    private String material;
    private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public BikePart() {

    }


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


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
