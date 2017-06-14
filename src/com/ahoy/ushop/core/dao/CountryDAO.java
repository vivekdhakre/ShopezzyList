package com.ahoy.ushop.core.dao;

import java.util.List;

import com.ahoy.ushop.core.domain.CountryDo;
import com.ahoy.ushop.core.domain.DealDo;

public interface CountryDAO {
	public CountryDo getCountryDetail(String country);
}
