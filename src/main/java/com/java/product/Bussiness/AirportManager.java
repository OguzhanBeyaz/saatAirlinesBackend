package com.java.product.Bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.java.product.DataAccess.IairportDal;
import com.java.product.Entity.Airport;

@Service
public class AirportManager implements IairportService{


		
		private IairportDal airportDal;

		@Autowired
		public AirportManager(IairportDal IairportDal) {
			
			this.airportDal = IairportDal;
		}
		@Override
		@Transactional
		public List<Airport> getAll() {
			// TODO Auto-generated method stub
			return  this.airportDal.getAll();
		}
		@Override
		@Transactional
		public void add(Airport airport) {
			// TODO Auto-generated method stub
			this.airportDal.add(airport);
			
		}
		@Override
		@Transactional
		public void update(Airport airport) {
			// TODO Auto-generated method stub
			this.airportDal.update(airport);
			
		}
		@Override
		@Transactional
		public void delete(Airport airport) {
			// TODO Auto-generated method stub
			this.airportDal.delete(airport);
			
		}
		@Override
		@Transactional
		public Airport getById(int airport_id) {
			// TODO Auto-generated method stub
			
			return this.airportDal.getById(airport_id);
		}

}
