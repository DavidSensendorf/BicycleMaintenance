package com.sensendorf.bikemaintenance.controllers;


import com.sensendorf.bikemaintenance.dao.userdata.CyclistDao;
import com.sensendorf.bikemaintenance.model.userdata.Cyclist;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cyclist")
public class CyclistController {
    private CyclistDao cyclistDao;

    public CyclistController(CyclistDao cyclistDao) {
        this.cyclistDao = cyclistDao;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Cyclist getCyclist(@PathVariable int id){
        Cyclist cyclist = cyclistDao.getCyclist(id);
        if (cyclist == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cyclist not found.");
        }else {
            return cyclist;
        }
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public Cyclist addBikePart(@RequestBody Cyclist bikePart){
        Cyclist returnBikePart = bikePartDao.createBikePart(bikePart);
        if (returnBikePart == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Cyclist submission.");
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

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    public void deleteBikePart(@PathVariable int id){
        if (bikePartDao.deleteBikePart(id) == false){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid bike part submission");
        }
    }
}
