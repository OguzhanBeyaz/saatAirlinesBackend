package com.java.product.DataAccess;

import java.util.List;

import com.java.product.Entity.Airport;

public interface IairportDal {
	
List<Airport> getAll();
	
	void add(Airport airport);
	
	void update(Airport airport);
	
	void delete(Airport airport);
	
	Airport getById(int airport_id);

}
