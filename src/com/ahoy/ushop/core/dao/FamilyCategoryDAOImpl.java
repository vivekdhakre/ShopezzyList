package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.FamilyCategoryDo;
//done
@Repository
public class FamilyCategoryDAOImpl implements FamilyCategoryDAO {

private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
  

	@SuppressWarnings("unchecked")
	@Override
	public List<FamilyCategoryDo> getFamilyCategoryList() {
		List<FamilyCategoryDo> familyCategoryDoList = sessionFactory.getCurrentSession().createCriteria(FamilyCategoryDo.class)
		.addOrder(Order.asc("familyCategoryPkey"))
		.list();

		if(familyCategoryDoList !=null && familyCategoryDoList.size()>0){
			return familyCategoryDoList;
		}else{
			return  null;
		}
	}
}
