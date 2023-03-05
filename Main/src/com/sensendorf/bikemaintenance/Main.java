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







        //System.out.println(frame.getBikePartsList().get("chain1").getAgeInterval());


    }
}