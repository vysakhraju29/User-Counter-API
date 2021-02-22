package com.vysakh.springboot.demo.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Vysakh
 * Java class for implementing interface NumberDAO.
 * It implements the save method where the currently stored number is
 * fetched from database table and incremented, then incremented value
 * is updated back into database table ie 'number'
 */
@Repository
public class NumberDAOImpl implements NumberDAO{
	
	private EntityManager entityManager;
	
	@Autowired
	public NumberDAOImpl(EntityManager theEntityManager)
	{
		entityManager=theEntityManager;
	}
	
	/*
	 * Save Method:
	 * Creates a session object using EntityManager
	 * Default id is set as 1 because only on record is updated.
	 * Getting value for number field from table 'number'
	 * Incrementing number upto 1 and setting it using setter of Number class
	 * Updating the counter in 'number' table
	 */
	public void save()
	{
		// Creates a session object using EntityManager
		Session currentSession=entityManager.unwrap(Session.class);
		
		// Default id is set as 1 because only on record is updated.
		int id=1;
		
		// Object for Number class is instantiated
		com.vysakh.springboot.demo.entity.Number myNumber=currentSession.get(com.vysakh.springboot.demo.entity.Number.class,id);
		
		//Getting value for number field from 'number' table
		int counter=myNumber.getNumber();
		
		//Incrementing the value for number
		counter++;
		
		//Setting the value for number
		myNumber.setNumber(counter);
		
		//Saving the value to Database table 'number'
		currentSession.saveOrUpdate(myNumber);
	}
}
