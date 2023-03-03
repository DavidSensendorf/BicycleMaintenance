package bikemaintenance.model.bikeclasses;

import bikemaintenance.model.service.ServiceRecord;

import java.util.List;

public class Bicycle {
    private int bicycleId;
    private int cyclistId;
    private String bicycleName;
    private String description;
    private List<ServiceRecord> serviceRecordList;
    private List<BikePart> listOfBikeParts;

    public int getBicycleId() {
        return bicycleId;
    }

    public void setBicycleId(int bicycleId) {
        this.bicycleId = bicycleId;
    }

    public int getCyclistId() {
        return cyclistId;
    }

    public void setCyclistId(int cyclistId) {
        this.cyclistId = cyclistId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBicycleName() {
        return bicycleName;
    }

    public void setBicycleName(String bicycleName) {
        this.bicycleName = bicycleName;
    }

    public List<ServiceRecord> getServiceRecordList() {
        return serviceRecordList;
    }

    public void setServiceRecordList(List<ServiceRecord> serviceRecordList) {
        this.serviceRecordList = serviceRecordList;
    }

    public List<BikePart> getListOfBikeParts() {
        return listOfBikeParts;
    }

    public void setListOfBikeParts(List<BikePart> listOfBikeParts) {
        this.listOfBikeParts = listOfBikeParts;
    }
}
