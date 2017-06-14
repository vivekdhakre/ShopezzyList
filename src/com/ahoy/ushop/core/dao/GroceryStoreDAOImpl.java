package com.ahoy.ushop.core.dao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class GroceryStoreDAOImpl implements GroceryStoreDAO{

	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
}


