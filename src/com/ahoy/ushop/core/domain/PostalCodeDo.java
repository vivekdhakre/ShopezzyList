package com.ahoy.ushop.core.domain;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.ahoy.ushop.core.custom.*;
//http://www.baeldung.com/jackson-ignore-properties-on-serialization
@JsonSerialize(using = LocationSerializer.class)
@JsonIgnoreProperties(value = {"postalCodePkey","dealPkey", "createdBy",
		"createdOn","updatedBy","updatedOn","accuracy","longitude","latitude","adminCode3","adminCode2","adminCode1"})
public class PostalCodeDo {

	private long postalCodePkey;
	@JsonProperty("country")
	private String countryCode;
	private String postalCode;
	@JsonProperty("place")
	private String placeName;
	@JsonProperty("adminName1")
	private String adminName1;
	private String adminCode1;
	@JsonProperty("adminName2")
	private String adminName2;
	private String adminCode2;
	@JsonProperty("adminName3")
	private String adminName3;
	private String adminCode3;
	private String latitude;
	private String longitude;
	private int accuracy;
	 
	 
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	 
	public long getPostalCodePkey() {
		return postalCodePkey;
	}
	public void setPostalCodePkey(long postalCodePkey) {
		this.postalCodePkey = postalCodePkey;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getAdminName1() {
		return adminName1;
	}
	public void setAdminName1(String adminName1) {
		this.adminName1 = adminName1;
	}
	public String getAdminCode1() {
		return adminCode1;
	}
	public void setAdminCode1(String adminCode1) {
		this.adminCode1 = adminCode1;
	}
	public String getAdminName2() {
		return adminName2;
	}
	public void setAdminName2(String adminName2) {
		this.adminName2 = adminName2;
	}
	public String getAdminCode2() {
		return adminCode2;
	}
	public void setAdminCode2(String adminCode2) {
		this.adminCode2 = adminCode2;
	}
	public String getAdminName3() {
		return adminName3;
	}
	public void setAdminName3(String adminName3) {
		this.adminName3 = adminName3;
	}
	public String getAdminCode3() {
		return adminCode3;
	}
	public void setAdminCode3(String adminCode3) {
		this.adminCode3 = adminCode3;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
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