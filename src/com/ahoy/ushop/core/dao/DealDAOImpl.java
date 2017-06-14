package com.ahoy.ushop.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.DealDo;
import com.ahoy.ushop.core.domain.GroceryItemInstanceDo;
import com.ahoy.ushop.core.domain.UserDo;
//done
@Repository
public class DealDAOImpl implements DealDAO {

	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<DealDo> getDealsByItemName(String groceryItemName) {
		List<DealDo> dealDoList=new ArrayList<DealDo>();
		for(int i=0;i<5;i++){
			dealDoList.add(new DealDo());
		}
		return dealDoList;
//		List<DealDo> dealDoList = sessionFactory.getCurrentSession().createCriteria(DealDo.class)
//		.add(Restrictions.eq("groceryItemName",groceryItemName))
//		.list();
//
//		if(dealDoList !=null && dealDoList.size()>0){
//			return dealDoList;	
//		}else{
//			return null;	
//		}
	}

	@Override
	public void addDeal(DealDo deal) {
		sessionFactory.getCurrentSession().save(deal);
		return;
	}
}
