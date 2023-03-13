package com.sensendorf.bikemaintenance.model.bikeclasses;

import com.sensendorf.bikemaintenance.model.service.ServiceRecord;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;


public class Bicycle implements Serializable {
    private int bicycleId;
    @NotBlank(message = "Cyclist ID is required.")
    private int cyclistId;
    @NotBlank(message = "A name for the bicycle is required.")
    private String bicycleName;
    private String description;
    private List<ServiceRecord> serviceRecordList;
    private List<BikePart> listOfBikeParts;

    public Bicycle() {
    }

    public Bicycle(int bicycleId, int cyclistId, String bicycleName, String description) {
        this.bicycleId = bicycleId;
        this.cyclistId = cyclistId;
        this.bicycleName = bicycleName;
        this.description = description;
    }

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
