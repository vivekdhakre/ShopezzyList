package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.PostalCodeDo;

@Repository
public class PostalCodeDAOImpl implements PostalCodeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<PostalCodeDo> getRecordByPostalCode(String postalCode) {
		List<PostalCodeDo> list =  sessionFactory.getCurrentSession().createCriteria(PostalCodeDo.class)
		.add(Restrictions.eq("postalCode",postalCode)).list();
		

		System.out.println(list.getClass()+"================================================"+postalCode);
		if(list !=null && list.size()>0){
			return list;	
		}else{
			return null;	
		}
	}

	@Override
	public List<String> getCitysByCountry(String country) {
		
		return null;
	}

	@Override
	public List<String> getAreasByCity(String city) {
	
		return null;
	}
	
}
