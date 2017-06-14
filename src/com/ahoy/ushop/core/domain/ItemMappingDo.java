package com.ahoy.ushop.core.domain;

import java.util.Date;

public class ItemMappingDo {
	 
	private long itemMappingPkey;
	private long groceryCategoryFkey;
	private long groceryItemFkey;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	public long getItemMappingPkey() {
		return itemMappingPkey;
	}
	public void setItemMappingPkey(long itemMappingPkey) {
		this.itemMappingPkey = itemMappingPkey;
	}
	public long getGroceryCategoryFkey() {
		return groceryCategoryFkey;
	}
	public void setGroceryCategoryFkey(long groceryCategoryFkey) {
		this.groceryCategoryFkey = groceryCategoryFkey;
	}
	public long getGroceryItemFkey() {
		return groceryItemFkey;
	}
	public void setGroceryItemFkey(long groceryItemFkey) {
		this.groceryItemFkey = groceryItemFkey;
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
