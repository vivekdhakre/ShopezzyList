package com.ahoy.ushop.core.dao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.GroceryItemInstanceDo;
@Repository
public class GroceryItemInstanceDAOImpl implements GroceryItemInstanceDAO{

	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addItemInstance(GroceryItemInstanceDo itemInstance) {
		sessionFactory.getCurrentSession().save(itemInstance);
		return;
	}
}
