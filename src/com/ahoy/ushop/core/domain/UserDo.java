package com.ahoy.ushop.core.domain;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
//http://www.baeldung.com/jackson-ignore-properties-on-serialization
//@JsonSerialize(using = DealDo.class)
@JsonIgnoreProperties(value = {"userPkey","createdBy","createdOn","updatedBy","updatedOn"})
public class UserDo {
	
	private long userPkey;
	//@JsonProperty("userAppId")
	private String userAppId;
	private String userName;
	private String userEmail;
	private String userMsisdn;
	private int isVeg;
	private long familyCategoryFkey;
	private int age;
	private String latLong;
	private String address;
	private String pinCode;
	private String city;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	public String getUserMsisdn() {
		return userMsisdn;
	}
	public void setUserMsisdn(String userMsisdn) {
		this.userMsisdn = userMsisdn;
	}
	public String getUserAppId() {
		return userAppId;
	}
	public void setUserAppId(String userAppId) {
		this.userAppId = userAppId;
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
	public long getUserPkey() {
		return userPkey;
	}
	public void setUserPkey(long userPkey) {
		this.userPkey = userPkey;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getIsVeg() {
		return isVeg;
	}
	public void setIsVeg(int isVeg) {
		this.isVeg = isVeg;
	}
	
	
	public long getFamilyCategoryFkey() {
		return familyCategoryFkey;
	}
	public void setFamilyCategoryFkey(long familyCategoryFkey) {
		this.familyCategoryFkey = familyCategoryFkey;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLatLong() {
		return latLong;
	}
	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserDo [userPkey=" + userPkey + ", userAppId=" + userAppId + ", userName=" + userName + ", userEmail="
				+ userEmail + ", userMsisdn=" + userMsisdn + ", isVeg=" + isVeg + ", familyCategoryFkey="
				+ familyCategoryFkey + ", age=" + age + ", latLong=" + latLong + ", address=" + address + ", pinCode="
				+ pinCode + ", city=" + city + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy="
				+ updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
	
	 
}
