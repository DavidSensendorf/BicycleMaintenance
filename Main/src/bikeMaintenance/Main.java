package bikemaintenance;


import bikemaintenance.bikeclasses.BrakePad;
import bikemaintenance.bikeclasses.Frame;
import bikemaintenance.bikeclasses.Chain;
import bikemaintenance.service.ServiceRecord;
import bikemaintenance.bikeclasses.Bicycle;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        LocalDate testDate = LocalDate.parse("2022-01-31");



        ServiceRecord serviceRecord = new ServiceRecord();
        serviceRecord.setServiceAgeInDays(1);
        serviceRecord.setServiceDistanceInMeters(2);
        serviceRecord.setServiceNotes("test");
        serviceRecord.setServicePart("part");

        Chain chain = new Chain();


        Frame frame;
        frame = new Frame();

        Bicycle bicycle = new Bicycle();
        bicycle.getChainMap().put("testChain", chain);
        System.out.println(bicycle.getChainMap().get("testChain").getLubeType());

        BrakePad brakePad = new BrakePad();
        brakePad.setAgeInterval(5);
        System.out.println(brakePad.getAgeInterval());
        brakePad.setInstallDate(testDate);
        System.out.println(brakePad.getInstallDate().toString());

        //System.out.println(frame.getBikePartsList().get("chain1").getAgeInterval());


    }
}