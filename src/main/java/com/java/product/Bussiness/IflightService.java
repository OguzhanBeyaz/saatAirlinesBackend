package com.java.product.Bussiness;

import java.util.List;

import com.java.product.Entity.Flight;

public interface IflightService {
	
	  List<Flight> getAll();
		
		void add(Flight flight);
		
		void update(Flight flight);
		
		void delete(Flight flight);
		
		Flight getById(int id);

}
