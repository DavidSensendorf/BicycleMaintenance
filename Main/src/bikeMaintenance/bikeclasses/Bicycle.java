package bikemaintenance.bikeclasses;

import bikemaintenance.bikeclasses.*;
import bikemaintenance.service.ServiceRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bicycle {
    private int bicycleId;
    private int cyclistId;
    private int bicycleFrameId;
    private String bicycleName;
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

    public int getBicycleFrameId() {
        return bicycleFrameId;
    }

    public void setBicycleFrameId(int bicycleFrameId) {
        this.bicycleFrameId = bicycleFrameId;
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
