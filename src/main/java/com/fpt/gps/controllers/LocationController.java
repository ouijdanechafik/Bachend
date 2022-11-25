package com.fpt.gps.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.gps.models.Location;
import com.fpt.gps.repository.LocationRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/location")
public class LocationController {
 
    @Autowired
    private LocationRepository locationRepository;
        
    @GetMapping
    public Iterable<Location> findAllLocation() {
    	List data = (List) locationRepository.findAll();
    	List<Location> locations = new ArrayList();
    	int limit = 40;
    	for(int i=0; i<limit; i++) {
    		locations.add((Location) data.get(i));
    	}
    	return locations;
    }


}