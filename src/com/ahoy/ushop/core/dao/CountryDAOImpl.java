package com.ahoy.ushop.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.CountryDo;
import com.ahoy.ushop.core.domain.DealDo;
@Repository
public class CountryDAOImpl implements CountryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public CountryDo getCountryDetail(String country) {
		List<CountryDo> list = sessionFactory.getCurrentSession().createCriteria(CountryDo.class)
		.add(Restrictions.eq("countryName",country))
		.list();

		if(list !=null && list.size()>0){
			return list.get(0);	
		}else{
			return null;	
		}
	}

}
