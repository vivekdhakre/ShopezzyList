package com.ahoy.ushop.core.domain;

import java.util.Date;
 
public class SampleDo implements java.io.Serializable {

	private long userPkey;
	private String userMaccountCode;
	private String userFirstName;
	private String userLastName;
	private String userRoles;
	private String userEmail;
	private String userPhoneNo;
	private String userPassword;
	private int userVerified;
	private int noOfAds;
	private int noOfAdplaces;

	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	 
	public String getUserMaccountCode() {
		return userMaccountCode;
	}
	public void setUserMaccountCode(String userMaccountCode) {
		this.userMaccountCode = userMaccountCode;
	}
	 
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhoneNo() {
		return userPhoneNo;
	}
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}
	public long getUserPkey() {
		return userPkey;
	}
	public void setUserPkey(long userPkey) {
		this.userPkey = userPkey;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(String userRoles) {
		this.userRoles = userRoles;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserVerified() {
		return userVerified;
	}
	public void setUserVerified(int userVerified) {
		this.userVerified = userVerified;
	}
	
	public int getNoOfAds() {
		return noOfAds;
	}
	public void setNoOfAds(int noOfAds) {
		this.noOfAds = noOfAds;
	}
	public int getNoOfAdplaces() {
		return noOfAdplaces;
	}
	public void setNoOfAdplaces(int noOfAdplaces) {
		this.noOfAdplaces = noOfAdplaces;
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
