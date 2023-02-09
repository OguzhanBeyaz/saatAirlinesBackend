package com.java.product.ProductController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.product.Bussiness.IairportService;
import com.java.product.Entity.Airport;

@RestController
@RequestMapping("/airport")
public class AirportController {
	
	private IairportService  airportService;

	@Autowired
	public AirportController(IairportService airportService) {
				
		this.airportService = airportService;
		
	}
	
	@GetMapping("/all")
	public List<Airport> get(){
		
		return airportService.getAll();
		 
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Airport airport) {
		airportService.add(airport);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Airport airport) {
		airportService.update(airport);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Airport airport) {
		airportService.delete(airport);
	}
	
	@GetMapping("/airport/{id}")
	public Airport getById(@PathVariable int id){
		
		return airportService.getById(id);
		
	}

}
