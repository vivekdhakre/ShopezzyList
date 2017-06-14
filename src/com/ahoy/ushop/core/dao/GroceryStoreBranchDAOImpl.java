package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.GroceryStoreBranchDo;

@Repository
public class GroceryStoreBranchDAOImpl implements GroceryStoreBranchDAO{

	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<GroceryStoreBranchDo> getStoresByPinCode(String pinCode) {
		
		@SuppressWarnings("unchecked")
		List<GroceryStoreBranchDo> list = sessionFactory.getCurrentSession().createCriteria(GroceryStoreBranchDo.class)
		.add(Restrictions.eq("groceryStoreBranchPinCode",pinCode))
		.list();

		if(list !=null && list.size()>0){
			return list;	
		}else{
			return null;	
		}
	}
}
