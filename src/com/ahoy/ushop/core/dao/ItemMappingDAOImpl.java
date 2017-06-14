package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.ItemMappingDo;

@Repository
public class ItemMappingDAOImpl implements ItemMappingDAO{

	private static final Logger logger = LoggerFactory.getLogger(ItemMappingDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<ItemMappingDo> getGroceryItemMappingByCategory(long categoryFkey) {
		List<ItemMappingDo> mappingList = sessionFactory.getCurrentSession().createCriteria(ItemMappingDo.class)
		.add(Restrictions.eq("groceryCategoryFkey",categoryFkey))
		.list();
		if(mappingList !=null && mappingList.size()>0){
			return mappingList;
		}else{
			return null;
		}
	}
}
