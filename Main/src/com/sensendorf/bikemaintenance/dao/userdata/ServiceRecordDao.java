package com.sensendorf.bikemaintenance.dao.userdata;

import com.sensendorf.bikemaintenance.model.bikeclasses.Brake;
import com.sensendorf.bikemaintenance.model.service.ServiceRecord;

import java.util.List;

public interface ServiceRecordDao {
    ServiceRecord getServiceRecord(int serviceRecordId);
    List<ServiceRecord> getAllBicycleServiceRecords(int bicycleId);
    List<ServiceRecord> getAllBicycleServiceRecords(int bicycleId, String partType);
    ServiceRecord createServiceRecord(ServiceRecord serviceRecord);
    boolean updateServiceRecord(ServiceRecord updatedServiceRecord);
    boolean deleteServiceRecord(int serviceRecordId);
}
