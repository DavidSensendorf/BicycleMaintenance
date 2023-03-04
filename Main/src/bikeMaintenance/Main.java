package bikemaintenance;


import bikemaintenance.dao.bikeclasses.BikePartDao;
import bikemaintenance.dao.bikeclasses.BrakeDao;
import bikemaintenance.dao.bikeclasses.JdbcBikePartDao;
import bikemaintenance.dao.bikeclasses.JdbcBrakeDao;
import bikemaintenance.model.bikeclasses.BikePart;
import bikemaintenance.model.bikeclasses.Brake;
import bikemaintenance.model.service.ServiceRecord;
import org.apache.commons.dbcp2.BasicDataSource;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/BicycleMaintenance");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        LocalDate testDate = LocalDate.parse("2022-01-31");

        BrakeDao brakeDao = new JdbcBrakeDao(dataSource);
        BikePartDao bikePartDao = new JdbcBikePartDao(dataSource);

        Brake brake = new Brake(-1, 2, "name", "description", "manufacturer",
                "model", 1975, "disc brake", testDate, 15, 1, 2,
                null, "steel", "organic", "organic2", true);

        BikePart bikePart = new BikePart(-1, 2, "name", "description", "manufacturer",
                "model", 1975, "disc brake", testDate, 15, 1, 2,
                null, "steel", "style");


       brakeDao.createBrake(brake);
       Brake getbrake = brakeDao.getBrake(11);
       System.out.println(getbrake.getPadType());





        ServiceRecord serviceRecord = new ServiceRecord();
        serviceRecord.setServiceAgeInDays(1);
        serviceRecord.setServiceDistanceInMeters(2);
        serviceRecord.setServiceNotes("test");
        serviceRecord.setServicePart("part");



        //System.out.println(frame.getBikePartsList().get("chain1").getAgeInterval());


    }
}