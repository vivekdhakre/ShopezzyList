package com.ahoy.ushop.core.domain;

import java.util.Date;

public class GroceryStoreDo {
	 
	private long groceryStorePkey;
	private String groceryStoreName;
	private String groceryStoreLogoImage;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	
	public String getGroceryStoreLogoImage() {
		return groceryStoreLogoImage;
	}
	public void setGroceryStoreLogoImage(String groceryStoreLogoImage) {
		this.groceryStoreLogoImage = groceryStoreLogoImage;
	}
	public long getGroceryStorePkey() {
		return groceryStorePkey;
	}
	public void setGroceryStorePkey(long groceryStorePkey) {
		this.groceryStorePkey = groceryStorePkey;
	}
	public String getGroceryStoreName() {
		return groceryStoreName;
	}
	public void setGroceryStoreName(String groceryStoreName) {
		this.groceryStoreName = groceryStoreName;
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
