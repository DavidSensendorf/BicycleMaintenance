package com.sensendorf.bikemaintenance.controllers;

import com.sensendorf.bikemaintenance.dao.bikeclasses.BikePartDao;
import com.sensendorf.bikemaintenance.model.bikeclasses.BikePart;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bikepart")
public class BikePartController {
    private BikePartDao bikePartDao;

    public BikePartController(BikePartDao bikePartDao) {
        this.bikePartDao = bikePartDao;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public BikePart getBikePart(@PathVariable int id){
        BikePart bikePart = bikePartDao.getBikePart(id);
        if (bikePart == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Bike Part not found.");
        }else {
            return bikePart;
        }
    }

    @RequestMapping(path = "/Bicycle/{id}", method = RequestMethod.GET)
    public List<BikePart> getBikePartsForBicycle(@RequestParam int id){
        List<BikePart> bikeParts = bikePartDao.getAllBicycleBikeParts(id);
        if (bikeParts == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No parts and/or bicycle ID found.");
        }else {
            return bikeParts;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public BikePart addBikePart(@RequestBody BikePart bikePart){
        BikePart returnBikePart = bikePartDao.createBikePart(bikePart);
        if (returnBikePart == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid bike part submission.");
        } else {
            return returnBikePart;
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.PUT)
    public void updateBikePart(@Valid @RequestBody BikePart bikePart){
        if (bikePartDao.updateBikePart(bikePart) == false){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid bike part submission");
        }
    }
}
