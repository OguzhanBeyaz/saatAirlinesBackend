package com.java.product.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.product.Entity.Flight;

import jakarta.persistence.EntityManager;

@Repository
public class SQLFlight implements IflightDal {
	
private EntityManager entityManager;
	
	@Autowired
	public void SQLFlightDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	

	@Override
	@Transactional
	public List<Flight> getAll() {
		// TODO Auto-generated method stub
		
		Session session = entityManager.unwrap(Session.class);

		List<Flight> test = session.createNativeQuery("select * from flight",Flight.class).getResultList();
	     return test;
	     
	}

	@Override
	public void add(Flight flight) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.save(flight);
	}

	@Override
	public void update(Flight flight) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.update(flight);
		
	}

	@Override
	public void delete(Flight flight) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Flight testToDelete = session.get(Flight.class, flight.getId());
		session.delete(testToDelete);
		
	}



	@Override
	public Flight getById(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Flight content = session.get(Flight.class, id);
		return content;
	}



	




}
