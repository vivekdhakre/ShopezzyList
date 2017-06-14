package com.ahoy.ushop.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahoy.ushop.core.dao.CountryDAO;
import com.ahoy.ushop.core.dao.FamilyCategoryDAO;
import com.ahoy.ushop.core.dao.GroceryCategoryDAO;
import com.ahoy.ushop.core.dao.GroceryBrandDAO;
import com.ahoy.ushop.core.dao.PostalCodeDAO;
import com.ahoy.ushop.core.domain.*;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private FamilyCategoryDAO familyCategoryDAO;
	@Autowired
	private GroceryCategoryDAO groceryCategoryDAO;
	@Autowired
	private GroceryBrandDAO groceryBrandDAO;
	@Autowired
	private PostalCodeDAO postalCodeDAO;
	@Autowired
	private CountryDAO countryDAO;
	
	@Transactional
	public List<String> getFamilyCategoryList() {
		return convertToStringList1(familyCategoryDAO.getFamilyCategoryList());
	}

	@Transactional
	public List<String> getGroceryCategoryList() {
		return convertToStringList2(groceryCategoryDAO.getGroceryCategoryList(8));
	}

	@Transactional
	public List<String> getGroceryBrandList() {
		return convertToStringList3(groceryBrandDAO.getGroceryBrandList());
	}

	
	private List<String> convertToStringList1(List<FamilyCategoryDo> familyCategoryDoList) {
		List<String> list=new ArrayList<String>();
		for(int i=0;i<familyCategoryDoList.size();i++){
			list.add(i, familyCategoryDoList.get(i).getFamilyCategoryName());
		}
		return list;
	}
	private List<String> convertToStringList2(List<GroceryCategoryDo> groceryCategoryDoList) {
		List<String> list=new ArrayList<String>();
		for(int i=0;i<groceryCategoryDoList.size();i++){
			list.add(i, groceryCategoryDoList.get(i).getGroceryCategoryName());
		}
		return list;
	}
	private List<String> convertToStringList3(List<GroceryBrandDo> groceryCategoryDoList) {
		List<String> list=new ArrayList<String>();
		for(int i=0;i<groceryCategoryDoList.size();i++){
			list.add(i, groceryCategoryDoList.get(i).getBrandName());
		}
		return list;
	}

	@Transactional
	public List<PostalCodeDo> getAddressByPostalCode(String postalCode) {
		List<PostalCodeDo> list=postalCodeDAO.getRecordByPostalCode(postalCode);
		
		return list;
	}

	@Transactional
	public CountryDo getCountryDetail(String country) {
		
		return countryDAO.getCountryDetail(country);
	}
}
