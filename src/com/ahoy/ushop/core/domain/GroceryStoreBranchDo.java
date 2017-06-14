package com.ahoy.ushop.core.domain;

import java.util.Date;

public class GroceryStoreBranchDo {
	  
	private long groceryStoreBranchPkey;
	private long groceryStoreFkey;
	private String groceryStoreBranchName;
	private String groceryStoreBranchAddress;
	private String groceryStoreBranchCity;
	private String groceryStoreBranchLatLong;
	private String groceryStoreBranchPinCode;
	 
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	public String getGroceryStoreBranchName() {
		return groceryStoreBranchName;
	}
	public void setGroceryStoreBranchName(String groceryStoreBranchName) {
		this.groceryStoreBranchName = groceryStoreBranchName;
	}
	public long getGroceryStoreBranchPkey() {
		return groceryStoreBranchPkey;
	}
	public void setGroceryStoreBranchPkey(long groceryStoreBranchPkey) {
		this.groceryStoreBranchPkey = groceryStoreBranchPkey;
	}
	public long getGroceryStoreFkey() {
		return groceryStoreFkey;
	}
	public void setGroceryStoreFkey(long groceryStoreFkey) {
		this.groceryStoreFkey = groceryStoreFkey;
	}
	public String getGroceryStoreBranchAddress() {
		return groceryStoreBranchAddress;
	}
	public void setGroceryStoreBranchAddress(String groceryStoreBranchAddress) {
		this.groceryStoreBranchAddress = groceryStoreBranchAddress;
	}
	public String getGroceryStoreBranchCity() {
		return groceryStoreBranchCity;
	}
	public void setGroceryStoreBranchCity(String groceryStoreBranchCity) {
		this.groceryStoreBranchCity = groceryStoreBranchCity;
	}
	public String getGroceryStoreBranchLatLong() {
		return groceryStoreBranchLatLong;
	}
	public void setGroceryStoreBranchLatLong(String groceryStoreBranchLatLong) {
		this.groceryStoreBranchLatLong = groceryStoreBranchLatLong;
	}
	public String getGroceryStoreBranchPinCode() {
		return groceryStoreBranchPinCode;
	}
	public void setGroceryStoreBranchPinCode(String groceryStoreBranchPinCode) {
		this.groceryStoreBranchPinCode = groceryStoreBranchPinCode;
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
