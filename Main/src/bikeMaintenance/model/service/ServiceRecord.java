package bikemaintenance.model.service;

public class ServiceRecord {


    private int serviceAgeInDays;
    private int serviceDistanceInMeters;
    private String serviceNotes;
    private String servicePart;

    public int getServiceAgeInDays() {
        return serviceAgeInDays;
    }

    public void setServiceAgeInDays(int serviceAgeInDays) {
        this.serviceAgeInDays = serviceAgeInDays;
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

    public String getServicePart() {
        return servicePart;
    }

    public void setServicePart(String servicePart) {
        this.servicePart = servicePart;
    }
}
