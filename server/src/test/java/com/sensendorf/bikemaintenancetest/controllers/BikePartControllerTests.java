package com.sensendorf.bikemaintenancetest.controllers;

import com.sensendorf.bikemaintenancetest.BaseTests;
import com.sensendorf.bikemaintenance.controllers.BikePartController;
import com.sensendorf.bikemaintenance.model.bikeclasses.BikePart;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class BikePartControllerTests extends BaseTests {
    private final BikePart testPart1 = new BikePart(-1, 1, "newTestPart1",
            "newDescription1", "newManufacturer1", "newModel1", 1981, "newFrame1",
            LocalDate.parse("2001-01-01"), 11, 11, 11, "newCarbon1", "newroad1");
    private final BikePart testPart2 = new BikePart(-1, 2, "newTestPart2",
            "newDescription2", "newManufacturer2", "newModel2", 1981, "newFrame2",
            LocalDate.parse("2002-01-01"), 12, 12, 12, "newCarbon2", "newroad2");

    private final BikePart updatePart1 = new BikePart(1, 2, "newTestPart2",
            "newDescription2", "newManufacturer2", "newModel2", 1981, "newFrame2",
            LocalDate.parse("2002-01-01"), 12, 12, 12, "newCarbon2", "newroad2");
    @Autowired
    private BikePartController controller;
    @Test
    public void getBikePart_gets_bike_part(){
        //controller.getBikePart()
    }
}
