package com.sensendorf.bikemaintenance.controllers;

import com.sensendorf.bikemaintenance.dao.bikeclasses.BicycleDao;
import com.sensendorf.bikemaintenance.dao.bikeclasses.BikePartDao;
import com.sensendorf.bikemaintenance.dao.userdata.CyclistDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(/)
public class BicycleController {
    private CyclistDao cyclistDao;
    private BicycleDao bicycleDao;
    private BikePartDao bikePartDao;

    public BicycleController(CyclistDao cyclistDao, BicycleDao bicycleDao, BikePartDao bikePartDao) {
        this.cyclistDao = cyclistDao;
        this.bicycleDao = bicycleDao;
        this.bikePartDao = bikePartDao;
    }


}
