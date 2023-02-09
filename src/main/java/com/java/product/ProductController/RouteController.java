package com.java.product.ProductController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.product.Bussiness.IrouteService;
import com.java.product.Entity.Route;

@RestController
@RequestMapping("/route")
public class RouteController {
	
	private IrouteService  routeService;

	@Autowired
	public RouteController(IrouteService routeService) {
				
		this.routeService = routeService;
		
	}
	
	@GetMapping("/all")
	public List<Route> get(){
		
		return routeService.getAll();
		 
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Route route) {
		routeService.add(route);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Route route) {
		routeService.update(route);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Route route) {
		routeService.delete(route);
	}
	
	@GetMapping("/route/{id}")
	public Route getById(@PathVariable int id){
		
		return routeService.getById(id);
		
	}

}
