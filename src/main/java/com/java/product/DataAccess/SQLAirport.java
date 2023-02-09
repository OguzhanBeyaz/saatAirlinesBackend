package com.java.product.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.product.Entity.Airport;

import jakarta.persistence.EntityManager;

@Repository
public class SQLAirport implements IairportDal {
	
private EntityManager entityManager;
	
	@Autowired
	public void SQLAirportDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	

	@Override
	@Transactional
	public List<Airport> getAll() {
		// TODO Auto-generated method stub
		
		Session session = entityManager.unwrap(Session.class);

		List<Airport> test = session.createNativeQuery("select * from airport",Airport.class).getResultList();
	     return test;
	     
	}

	@Override
	public void add(Airport airport) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.save(airport);
	}

	@Override
	public void update(Airport airport) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.update(airport);
		
	}

	@Override
	public void delete(Airport airport) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Airport testToDelete = session.get(Airport.class, airport.getId());
		session.delete(testToDelete);
		
	}



	@Override
	public Airport getById(int airport_id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Airport content = session.get(Airport.class, airport_id);
		return content;
	}



	




}
