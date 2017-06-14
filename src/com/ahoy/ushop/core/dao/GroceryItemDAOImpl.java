package com.ahoy.ushop.core.dao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.GroceryItemDo;

@Repository
public class GroceryItemDAOImpl implements GroceryItemDAO{

	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public GroceryItemDo getGroceryItemById(long id) {
		
		GroceryItemDo groceryItemDo=(GroceryItemDo)sessionFactory.getCurrentSession().get(GroceryItemDo.class, id);
		sessionFactory.getCurrentSession().evict(groceryItemDo);
		return groceryItemDo;
		
		
	}
	@Override
	public  void  doIt() {
		for(long i=1;i<161;i++){
			GroceryItemDo groceryItemDo=(GroceryItemDo)sessionFactory.getCurrentSession().get(GroceryItemDo.class, i);
			System.out.println(groceryItemDo+"======================================="+i);
			if(groceryItemDo!=null)
				groceryItemDo.setGroceryItemImage(i+".png");
			
		}
		//return (GroceryItemDo)sessionFactory.getCurrentSession().get(GroceryItemDo.class, id);
		
	}
	
}
