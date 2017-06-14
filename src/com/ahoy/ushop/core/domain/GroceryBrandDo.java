package com.ahoy.ushop.core.domain;

import java.util.Date;

public class GroceryBrandDo {

//	grocery_brand_pkey bigint UNSIGNED NOT NULL auto_increment,
//	brand_name varchar(100) ,
	 
	
	private long groceryBrandPkey;
	private String brandName;
	private String groceryBrandImage;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	public String getGroceryBrandImage() {
		return groceryBrandImage;
	}
	public void setGroceryBrandImage(String groceryBrandImage) {
		this.groceryBrandImage = groceryBrandImage;
	}
	public long getGroceryBrandPkey() {
		return groceryBrandPkey;
	}
	public void setGroceryBrandPkey(long groceryBrandPkey) {
		this.groceryBrandPkey = groceryBrandPkey;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
