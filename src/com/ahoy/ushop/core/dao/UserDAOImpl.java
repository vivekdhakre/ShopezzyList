package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.UserDo;
//done
@Repository
public class UserDAOImpl implements UserDAO{

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
		
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUser(UserDo user) {
		logger.debug("Inside UserDAOImpl: addUser: "+user);
		sessionFactory.getCurrentSession().save(user);
		return;
	}
	
	@Override
	public UserDo getUserById(long id) {
		logger.debug("Inside UserDAOImpl: getUserById: "+id);
		UserDo userDo = (UserDo) sessionFactory.getCurrentSession().get(UserDo.class, id);
		System.out.println(sessionFactory.getCurrentSession().getFlushMode()+"======================================");
		return userDo;
	}

	@Override
	public void updateUser(UserDo user) {
		logger.debug("Inside UserDAOImpl: updateUser: "+user);	
		UserDo userDo=getUserByAppId( user.getUserAppId());
		user.setUserPkey(userDo.getUserPkey());
		sessionFactory.getCurrentSession().evict(userDo);
		sessionFactory.getCurrentSession().update(user);
		return;
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public UserDo getUserByAppId(String appId) {
		logger.debug("Inside UserDAOImpl: getUserByUserName: "+appId);
		List<UserDo> userDoList = sessionFactory.getCurrentSession().createCriteria(UserDo.class)
		.add(Restrictions.eq("userAppId",appId))
		.list();

		UserDo userDo;
		if(userDoList !=null && userDoList.size()>0){
			userDo = userDoList.get(0);
		}else{
			userDo= null;
		}
		return userDo;	
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserDo> getUserList() {
		List<UserDo> userDoList = sessionFactory.getCurrentSession().createCriteria(UserDo.class).list();
		
		if(userDoList !=null && userDoList.size()>0){
			return userDoList;
		}else{
			return  null;
		}	
	}
	

	@Override
	public int getTotalUsers() {
		logger.debug("Inside UserDAOImpl: getTotalUsers: ");
		Integer count = (Integer)sessionFactory.getCurrentSession().createCriteria(UserDo.class)
		.setProjection( Projections.rowCount()).uniqueResult();
		return count;	
	}
} 
