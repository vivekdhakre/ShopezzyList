package com.ahoy.ushop.core.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

 
import com.ahoy.ushop.core.domain.CountryDo;
import com.ahoy.ushop.core.domain.PostalCodeDo;
import com.ahoy.ushop.core.service.LocationService;
@Controller
public class LocationController {
	@Autowired 
	private LocationService locationService;
	
	 
	@RequestMapping(value = "/getAddressByPostalCode")
	public @ResponseBody List<PostalCodeDo>  getAddressByPostalCode(@RequestParam(required = true, value = "postalCode") String postalCode ) {
		System.out.println(postalCode+"===================================================");
		List<PostalCodeDo> list =locationService.getAddressByPostalCode(postalCode);
		System.out.println(list.get(1)+"===================================================");
		return list;
	}
	@RequestMapping(value = "/getCountryList")
	public @ResponseBody List<String>  getCountryList( ) {
		List<String> list =new ArrayList<String>(Arrays.asList("india", "usa", "uk"));
		return list;
	}
	@RequestMapping(value = "/getCountryDetail")
	public @ResponseBody CountryDo  getCountryDetail(@RequestParam(required = true, value = "country") String country ) {
		CountryDo countryDo =locationService.getCountryDetail(country);
		List<String> list =new ArrayList<String>(Arrays.asList("delhi", "mumbai", "kolkata"));
		countryDo.setCities(list);
		return countryDo;
	}
}
