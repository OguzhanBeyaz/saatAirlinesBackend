package com.java.product.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.product.Entity.Route;

import jakarta.persistence.EntityManager;

@Repository
public class SQLRoute implements IrouteDal {
	
private EntityManager entityManager;
	
	@Autowired
	public void SQLRouteDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	

	@Override
	@Transactional
	public List<Route> getAll() {
		// TODO Auto-generated method stub
		
		Session session = entityManager.unwrap(Session.class);

		List<Route> test = session.createNativeQuery("select * from route",Route.class).getResultList();
	     return test;
	     
	}

	@Override
	public void add(Route route) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.save(route);
	}

	@Override
	public void update(Route route) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
	    session.update(route);
		
	}

	@Override
	public void delete(Route route) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Route testToDelete = session.get(Route.class, route.getId());
		session.delete(testToDelete);
		
	}



	@Override
	public Route getById(int id) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		Route content = session.get(Route.class, id);
		return content;
	}



	

	




}
