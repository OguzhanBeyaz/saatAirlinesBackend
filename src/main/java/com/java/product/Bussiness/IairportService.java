package com.java.product.Bussiness;

import java.util.List;

import com.java.product.Entity.Airport;

public interface IairportService {
  
	  List<Airport> getAll();
		
		void add(Airport airport);
		
		void update(Airport airport);
		
		void delete(Airport airport);
		
		Airport getById(int airport_id);

}
