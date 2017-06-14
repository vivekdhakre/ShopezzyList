package com.ahoy.ushop.core.service;

import java.util.List;

import com.ahoy.ushop.core.domain.CountryDo;
import com.ahoy.ushop.core.domain.PostalCodeDo;

public interface LocationService {

	public List<String> getFamilyCategoryList();
	public List<String> getGroceryCategoryList();
	public List<String> getGroceryBrandList();
	public List<PostalCodeDo> getAddressByPostalCode(String postalCode);
	public CountryDo getCountryDetail(String country);
}
