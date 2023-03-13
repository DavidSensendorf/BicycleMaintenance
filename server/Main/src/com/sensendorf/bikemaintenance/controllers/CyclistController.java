package com.sensendorf.bikemaintenance.controllers;


import com.sensendorf.bikemaintenance.dao.userdata.CyclistDao;
import com.sensendorf.bikemaintenance.model.userdata.Cyclist;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

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
    public Cyclist addCyclist(@RequestBody Cyclist cyclist){
        Cyclist returnCyclist = cyclistDao.createCyclist(cyclist);
        if (returnCyclist == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Cyclist submission.");
        } else {
            return returnCyclist;
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.PUT)
    public void updateCyclist(@Valid @RequestBody Cyclist cyclist){
        if (cyclistDao.updateCyclist(cyclist) == false){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Cyclist submission");
        }
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    public void deleteCyclist(@PathVariable int id){
        if (cyclistDao.deleteCyclist(id) == false){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Cyclist submission");
        }
    }
}
