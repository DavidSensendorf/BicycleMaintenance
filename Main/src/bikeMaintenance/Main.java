package bikemaintenance;


import bikemaintenance.bikeclasses.Frame;
import bikemaintenance.bikeclasses.Chain;
import bikemaintenance.service.ServiceRecord;
import bikemaintenance.userdata.Bicycle;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        LocalDate testDate = LocalDate.parse("2022-01-31");



        ServiceRecord serviceRecord = new ServiceRecord();
        serviceRecord.setServiceAgeInDays(1);
        serviceRecord.setServiceDistanceInMeters(2);
        serviceRecord.setServiceNotes("test");
        serviceRecord.setServicePart("part");

        Chain chain = new Chain(1, testDate, "model,year", 5, "wax", 1,
                2, 3, 4);


        Frame frame;
        frame = new Frame(0, 0, "Bike test", "Domane", "Trek",
                "Domane,2022", LocalDate.parse("2022-01-30"), 0, 300, 4000);

        Bicycle bicycle = new Bicycle(frame);
        bicycle.getChainMap().put("testChain", chain);
        System.out.println(bicycle.getChainMap().get("testChain").getLubeType());

        //System.out.println(frame.getBikePartsList().get("chain1").getAgeInterval());


    }
}