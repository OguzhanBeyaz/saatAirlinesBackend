package com.java.product.Bussiness;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.product.DataAccess.IflightDal;
import com.java.product.Entity.Flight;

import sabitler.statusValues;
@EnableAsync
@Service
public class FlightManager implements IflightService{


	 
	 
private IflightDal flightDal;
	
	private List<Flight> data;
	@Async
	@Scheduled(fixedRate = 10000)
	public void checkSystemDate() {
	      data=flightDal.getAll();
	      
     for (Flight flight : data) {
	         LocalDate now = LocalDate.now();
	         Instant instant = now.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
	         Date dateNow = Date.from(instant);
	         if (dateNow ==  flight.getDepartureTime()) {
	             flight.setStatus(statusValues.Departed);
	             this.flightDal.update(flight);
	             
	         } else if (dateNow == flight.getArrivalTime()) {
	        	 flight.setStatus(statusValues.Arrived);
	             this.flightDal.update(flight);	        	        
	         }
     }
	    
	      
	      
	  }

	@Autowired
	public FlightManager(IflightDal IflightDal) {
		
		this.flightDal = IflightDal;
	}
	@Override
	@Transactional
	public List<Flight> getAll() {
		// TODO Auto-generated method stub
		return  this.flightDal.getAll();
	}
	@Override
	@Transactional
	public void add(Flight flight) {
		// TODO Auto-generated method stub
		this.flightDal.add(flight);
		
	}
	@Override
	@Transactional
	public void update(Flight flight) {
		// TODO Auto-generated method stub
		this.flightDal.update(flight);
		
	}
	@Override
	@Transactional
	public void delete(Flight flight) {
		// TODO Auto-generated method stub
		this.flightDal.delete(flight);
		
	}
	@Override
	@Transactional
	public Flight getById(int id) {
		// TODO Auto-generated method stub
		
		return this.flightDal.getById(id);
	}

}
