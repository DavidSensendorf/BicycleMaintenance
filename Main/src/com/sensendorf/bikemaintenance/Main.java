package com.sensendorf.bikemaintenance;


import com.sensendorf.bikemaintenance.dao.bikeclasses.*;
import com.sensendorf.bikemaintenance.model.bikeclasses.Bicycle;
import com.sensendorf.bikemaintenance.model.bikeclasses.BikePart;
import com.sensendorf.bikemaintenance.model.bikeclasses.Brake;
import com.sensendorf.bikemaintenance.model.service.ServiceRecord;
import org.apache.commons.dbcp2.BasicDataSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/BicycleMaintenance");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        LocalDate testDate = LocalDate.parse("2022-01-31");

        BrakeDao brakeDao = new JdbcBrakeDao(dataSource);
        BikePartDao bikePartDao = new JdbcBikePartDao(dataSource);
        BicycleDao bicycleDao = new JdbcBicycleDao(dataSource);

        Brake brake = new Brake(-1, 2, "name", "description", "manufacturer",
                "model", 1975, "disc brake", testDate, 15, 1, 2,
                null, "steel", "organic", "organic2", true);

        BikePart bikePart = new BikePart(-1, 2, "name", "description", "manufacturer",
                "model", 1975, "disc brake", testDate, 15, 1, 2,
                null, "steel", "style");


        Bicycle bicycle = bicycleDao.getBicycle(2);
        System.out.println(bicycle.getBicycleName());

        List<Bicycle> bicycleList;
        bicycleList= bicycleDao.getAllUserBicycles(2);
        System.out.println(bicycleList.size());
        bicycleList= bicycleDao.getAllUserBicycles(1);
        System.out.println(bicycleList.size());






        //System.out.println(frame.getBikePartsList().get("chain1").getAgeInterval());


    }
}