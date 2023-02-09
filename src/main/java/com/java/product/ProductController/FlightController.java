package com.java.product.ProductController;

import java.time.Clock;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.product.Bussiness.IflightService;
import com.java.product.Entity.Flight;

import sabitler.statusValues;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	private IflightService  flightService;

	@Autowired
	public FlightController(IflightService flightService) {
				
		this.flightService = flightService;
		
	}

	@GetMapping("/all")
	public List<Flight> get(){
		
		return flightService.getAll();
		 
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Flight flight) {
		flight.setStatus(statusValues.Scheduled);
		
     
		flightService.add(flight);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Flight flight) {
		flight.setStatus(statusValues.Scheduled);
		
		flightService.update(flight);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Flight flight) {
		flightService.delete(flight);
	}
	
	@GetMapping("/flight/{id}")
	public Flight getById(@PathVariable int id){
		
		return flightService.getById(id);
		
	}

}
