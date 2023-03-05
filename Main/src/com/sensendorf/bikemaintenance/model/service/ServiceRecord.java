package com.sensendorf.bikemaintenance.model.service;

import java.time.LocalDate;

public class ServiceRecord {


    private int servicePartId;
    private LocalDate serviceDate;
    private int serviceDistanceInMeters;
    private String serviceNotes;
    private String serviceType;


    public ServiceRecord() {
    }

    public ServiceRecord(LocalDate serviceDate, int serviceDistanceInMeters, String serviceNotes, String serviceType, int servicePartId) {
        this.serviceDate = serviceDate;
        this.serviceDistanceInMeters = serviceDistanceInMeters;
        this.serviceNotes = serviceNotes;
        this.serviceType = serviceType;
        this.servicePartId = servicePartId;
    }


    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public int getServiceDistanceInMeters() {
        return serviceDistanceInMeters;
    }

    public void setServiceDistanceInMeters(int serviceDistanceInMeters) {
        this.serviceDistanceInMeters = serviceDistanceInMeters;
    }

    public String getServiceNotes() {
        return serviceNotes;
    }

    public void setServiceNotes(String serviceNotes) {
        this.serviceNotes = serviceNotes;
    }

    public int getServicePartId() {
        return servicePartId;
    }

    public void setServicePartId(int servicePartId) {
        this.servicePartId = servicePartId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
