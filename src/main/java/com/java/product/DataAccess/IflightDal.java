package com.java.product.DataAccess;

import java.util.List;

import com.java.product.Entity.Flight;

public interface IflightDal {
	
List<Flight> getAll();
	
	void add(Flight flight);
	
	void update(Flight flight);
	
	void delete(Flight flight);
	
	Flight getById(int id);

}
