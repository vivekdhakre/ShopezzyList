package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.PostalCodeDo;

public interface PostalCodeDAO {
	public List<PostalCodeDo> getRecordByPostalCode(String postalCode);
	public List<String> getCitysByCountry(String country);
	public List<String> getAreasByCity(String city);
	 
}
