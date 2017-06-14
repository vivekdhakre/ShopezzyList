package com.ahoy.ushop.core.domain;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
//http://www.baeldung.com/jackson-ignore-properties-on-serialization
//@JsonSerialize(using = DealDo.class)
@JsonIgnoreProperties(value = {"countryPkey", "createdBy","createdOn","updatedBy","updatedOn"})
public class CountryDo {
	 
	private long countryPkey;
	@JsonProperty("name")
	private String countryName;
	@JsonProperty("currency")
	private String countryCurrency;
	@JsonProperty("metricSystem")
	private String countryMetricSystem;
	@JsonProperty("language")
	private String countryLanguage;
	@JsonProperty("cities")
	private List<String> cities;
	 
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public long getCountryPkey() {
		return countryPkey;
	}
	public void setCountryPkey(long countryPkey) {
		this.countryPkey = countryPkey;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCurrency() {
		return countryCurrency;
	}
	public void setCountryCurrency(String countryCurrency) {
		this.countryCurrency = countryCurrency;
	}
	public String getCountryMetricSystem() {
		return countryMetricSystem;
	}
	public void setCountryMetricSystem(String countryMetricSystem) {
		this.countryMetricSystem = countryMetricSystem;
	}
	public String getCountryLanguage() {
		return countryLanguage;
	}
	public void setCountryLanguage(String countryLanguage) {
		this.countryLanguage = countryLanguage;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	 
	
}
