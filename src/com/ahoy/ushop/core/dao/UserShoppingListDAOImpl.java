package com.ahoy.ushop.core.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahoy.ushop.core.domain.DefaultShoppingListDo;
import com.ahoy.ushop.core.domain.UserDo;
import com.ahoy.ushop.core.domain.UserShoppingListDo;
//done
@Repository
public class UserShoppingListDAOImpl implements UserShoppingListDAO{

	private static final Logger logger = LoggerFactory.getLogger(SampleDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	 
	@Override
	public void addUserShoppingList(UserShoppingListDo userShoppingListDo) {
		logger.debug("Inside UserShoppingListDAOImpl: addUserShoppingList: "+userShoppingListDo);
		sessionFactory.getCurrentSession().save(userShoppingListDo);
		return;
	}
	@SuppressWarnings("unchecked")
	@Override
	public UserShoppingListDo getShoppingListByUserAppId(String userAppId) {
		logger.debug("Inside UserShoppingListDAOImpl: getShoppingListByUser: ");
		List<UserShoppingListDo> list = sessionFactory.getCurrentSession().createCriteria(UserShoppingListDo.class)
		.add(Restrictions.eq("userAppId",userAppId))
		.addOrder(Order.desc("updatedOn"))
		.list();

		UserShoppingListDo userShoppingListDo;
		if(list !=null && list.size()>0){
			userShoppingListDo = list.get(0);
		}else{
			userShoppingListDo= null;
		}
		return userShoppingListDo;	
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<UserShoppingListDo> getShoppingListsByUser(long userFkey) {
		logger.debug("Inside UserShoppingListDAOImpl: getShoppingListsByUser: ");
		List<UserShoppingListDo> list = sessionFactory.getCurrentSession().createCriteria(UserShoppingListDo.class)
		.add(Restrictions.eq("userFkey",userFkey))
		.addOrder(Order.desc("updatedOn"))
		.list();
 
		if(list !=null && list.size()>0){
			return list;
		}else{
			return null;
		}
	}
	@Override
	public UserShoppingListDo getShoppingListByUser(long userFkey) {
		logger.debug("Inside UserShoppingListDAOImpl: getShoppingListsByUser: ");
		List<UserShoppingListDo> list = sessionFactory.getCurrentSession().createCriteria(UserShoppingListDo.class)
		.add(Restrictions.eq("userFkey",userFkey))
		.addOrder(Order.desc("updatedOn"))
		.list();
 
		if(list !=null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	
	
	
}
