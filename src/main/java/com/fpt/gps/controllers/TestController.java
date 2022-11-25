package com.fpt.gps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpt.gps.models.Test;
import com.fpt.gps.repository.TestRepository;

@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
    private TestRepository testRepository;
        
    @GetMapping
    public Iterable<Test> findAllLocation() {
		/*
		 * Iterable<Test> tests = testRepository.findAll(); for(Test t:tests){
		 * System.out.println(t.name); }
		 */
    	
    	return testRepository.findAll();
    }
 
}
