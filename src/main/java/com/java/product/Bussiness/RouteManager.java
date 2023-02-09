package com.java.product.Bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.product.DataAccess.IrouteDal;
import com.java.product.Entity.Route;

@Service
public class RouteManager implements IrouteService {
	
	private IrouteDal routeDal;

	@Autowired
	public RouteManager(IrouteDal IrouteDal) {
		
		this.routeDal = IrouteDal;
	}
	@Override
	@Transactional
	public List<Route> getAll() {
		// TODO Auto-generated method stub
		return  this.routeDal.getAll();
	}
	@Override
	@Transactional
	public void add(Route route) {
		// TODO Auto-generated method stub
		this.routeDal.add(route);
		
	}
	@Override
	@Transactional
	public void update(Route route) {
		// TODO Auto-generated method stub
		this.routeDal.update(route);
		
	}
	@Override
	@Transactional
	public void delete(Route route) {
		// TODO Auto-generated method stub
		this.routeDal.delete(route);
		
	}
	@Override
	@Transactional
	public Route getById(int id) {
		// TODO Auto-generated method stub
		
		return this.routeDal.getById(id);
	}


}
