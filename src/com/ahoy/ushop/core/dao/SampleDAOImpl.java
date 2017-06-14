package com.ahoy.ushop.core.dao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
@Repository
public class SampleDAOImpl implements SampleDAO {

	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
		
	@Autowired
	private SessionFactory sessionFactory;
  
	@Override
	public void addEvent(String event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEvent(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getEventById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
