package bikemaintenance;


import bikemaintenance.model.service.ServiceRecord;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {




        LocalDate testDate = LocalDate.parse("2022-01-31");



        ServiceRecord serviceRecord = new ServiceRecord();
        serviceRecord.setServiceAgeInDays(1);
        serviceRecord.setServiceDistanceInMeters(2);
        serviceRecord.setServiceNotes("test");
        serviceRecord.setServicePart("part");



        //System.out.println(frame.getBikePartsList().get("chain1").getAgeInterval());


    }
}