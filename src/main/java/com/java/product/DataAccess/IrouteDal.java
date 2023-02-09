package com.java.product.DataAccess;

import java.util.List;

import com.java.product.Entity.Route;

public interface IrouteDal {
	
List<Route> getAll();
	
	void add(Route route);
	
	void update(Route route);
	
	void delete(Route route);
	
	Route getById(int id);

}
