package com.java.product.Bussiness;

import java.util.List;

import com.java.product.Entity.Route;

public interface IrouteService {
	

		  
		  List<Route> getAll();
			
			void add(Route route);
			
			void update(Route route);
			
			void delete(Route route);
			
			Route getById(int id);
	

}
