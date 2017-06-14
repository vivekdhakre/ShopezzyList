package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.FamilyCategoryDo;
import com.ahoy.ushop.core.domain.GroceryCategoryDo;
import com.ahoy.ushop.core.domain.UserDo;
//done
@Repository
public class GroceryCategoryDAOImpl implements GroceryCategoryDAO{
	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
 
	@SuppressWarnings("unchecked")
	@Override
	public List<GroceryCategoryDo> getGroceryCategoryList(int fType) {
		List<GroceryCategoryDo> groceryCategoryDoList =null; 
		switch(fType){
			case 1:
				groceryCategoryDoList=sessionFactory.getCurrentSession().createCriteria(GroceryCategoryDo.class)
				.addOrder(Order.asc("groceryCategoryOrderOne"))
				.list();
				break;
			case 2:
				groceryCategoryDoList=sessionFactory.getCurrentSession().createCriteria(GroceryCategoryDo.class)
				.addOrder(Order.asc("groceryCategoryOrderTwo"))
				.list();
				break;
			case 3:
				groceryCategoryDoList=sessionFactory.getCurrentSession().createCriteria(GroceryCategoryDo.class)
				.addOrder(Order.asc("groceryCategoryOrderThree"))
				.list();
				break;
			case 4:	
				groceryCategoryDoList=sessionFactory.getCurrentSession().createCriteria(GroceryCategoryDo.class)
				.addOrder(Order.asc("groceryCategoryOrderFour"))
				.list();
				break;
		}
		if(groceryCategoryDoList !=null && groceryCategoryDoList.size()>0){
			return groceryCategoryDoList;
		}else{
			return  null;
		}
	}

	@Override
	public GroceryCategoryDo getGroceryCategoryById(long id) {
		GroceryCategoryDo groceryCategoryDo = (GroceryCategoryDo) sessionFactory.getCurrentSession().get(GroceryCategoryDo.class, id);
		return groceryCategoryDo;
		 
	}
	
}
