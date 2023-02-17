package bikeMaintenance;


import bikeMaintenance.BikeClasses.Bicycle;
import bikeMaintenance.BikeClasses.Chain;
import bikeMaintenance.Service.ServiceRecord;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LocalDate testDate = LocalDate.parse("2022-01-31");


        Map<String, Object> partsmap = new HashMap<>();
        Map<String, Object> servicemap = new HashMap<>();

        ServiceRecord serviceRecord = new ServiceRecord();
        serviceRecord.setServiceAgeInDays(1);
        serviceRecord.setServiceDistanceInMeters(2);
        serviceRecord.setServiceNotes("test");
        serviceRecord.setServicePart("part");

        Chain chain = new Chain(1, testDate, "model,year", 5, "wax", 1,
                2, 3, 4);

        partsmap.put("chain1", chain);
        servicemap.put("service1", serviceRecord);

        Bicycle bicycle;
        bicycle = new Bicycle(0, 0, "Bike test", "Domane", "Trek",
                "Domane,2022", LocalDate.parse("2022-01-30"), 0, 300, 4000,
                partsmap, servicemap);

        //System.out.println(bicycle.getBikePartsList().get("chain1").getAgeInterval());


    }
}