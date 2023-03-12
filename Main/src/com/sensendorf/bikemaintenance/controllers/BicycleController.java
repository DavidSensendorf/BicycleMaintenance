package com.sensendorf.bikemaintenance.controllers;

import com.sensendorf.bikemaintenance.dao.bikeclasses.BicycleDao;
import com.sensendorf.bikemaintenance.model.bikeclasses.Bicycle;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bicycle")
public class BicycleController {
    private BicycleDao bicycleDao;

    public BicycleController(BicycleDao bicycleDao) {
        this.bicycleDao = bicycleDao;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Bicycle getBicycle(@PathVariable int id){
        Bicycle bicycle = bicycleDao.getBicycle(id);
        if (bicycle == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Bicycle not found.");
        }else {
            return bicycle;
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Bicycle> getBicyclesForUser(@RequestParam() int id){
        List<Bicycle> bicycleList = bicycleDao.getAllUserBicycles(id);
        if(bicycleList.size() == 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No bicycles found for that user.");
        }else {
            return bicycleList;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public Bicycle addBicycle(@Valid @RequestBody Bicycle bicycle){
        Bicycle bicycleCreated = bicycleDao.createBicycle(bicycle);
        if (bicycleCreated == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid bicycle submission.");
        }else {
            return bicycleCreated;
        }
    }


}
