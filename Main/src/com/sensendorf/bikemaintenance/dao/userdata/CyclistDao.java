package com.sensendorf.bikemaintenance.dao.userdata;

import com.sensendorf.bikemaintenance.model.userdata.Cyclist;

public interface CyclistDao {
    Cyclist getCyclist(int cyclistId);
    //List<Cyclist> getAllCyclists();
    Cyclist createCyclist(Cyclist cyclist);
    boolean updateCyclist(Cyclist updatedCyclist);
    boolean deleteCyclist(int cyclistId);

    //    ServiceRecord getServiceRecord(int serviceRecordId);
//    List<ServiceRecord> getAllBicycleServiceRecords(int bicycleId);
//    List<ServiceRecord> getAllBicycleServiceRecords(int bicycleId, String partType);
//    ServiceRecord createServiceRecord(ServiceRecord serviceRecord);
//    boolean updateServiceRecord(ServiceRecord updatedServiceRecord);
//    boolean deleteServiceRecord(int serviceRecordId);
}
