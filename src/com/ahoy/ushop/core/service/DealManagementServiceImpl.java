package com.ahoy.ushop.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahoy.ushop.core.dao.DealDAO;
import com.ahoy.ushop.core.domain.DealDo;
import com.ahoy.ushop.core.domain.GroceryItemInstanceDo;

@Service
public class DealManagementServiceImpl implements DealManagementService {

	@Autowired 
	private DealDAO dealDAO;
	
	@Transactional
	public List<DealDo> getDealsByItem(String itemName){
		return dealDAO.getDealsByItemName(itemName);
	}

	@Transactional
	public void addDeals(List<DealDo> deals) {
		for(int i=0;i<deals.size();i++)
			dealDAO.addDeal(deals.get(i));
	}
}
