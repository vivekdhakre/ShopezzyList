package com.ahoy.ushop.core.domain;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class GroceryItemInstanceDo {
	
	private long groceryItemInstancePkey;
	@JsonProperty("groceryBrand")
	private long groceryBrandFkey;
	@JsonProperty("groceryItem")
	private long groceryItemFkey;
	private String groceryItemInstanceImage;
	private String groceryItemInstanceName;
	private String groceryItemQualityCategory;
	private String groceryItemMrp;
	 
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	public long getGroceryItemInstancePkey() {
		return groceryItemInstancePkey;
	}
	public void setGroceryItemInstancePkey(long groceryItemInstancePkey) {
		this.groceryItemInstancePkey = groceryItemInstancePkey;
	}
	public long getGroceryBrandFkey() {
		return groceryBrandFkey;
	}
	public void setGroceryBrandFkey(long groceryBrandFkey) {
		this.groceryBrandFkey = groceryBrandFkey;
	}
	public long getGroceryItemFkey() {
		return groceryItemFkey;
	}
	public void setGroceryItemFkey(long groceryItemFkey) {
		this.groceryItemFkey = groceryItemFkey;
	}
	public String getGroceryItemInstanceImage() {
		return groceryItemInstanceImage;
	}
	public void setGroceryItemInstanceImage(String groceryItemInstanceImage) {
		this.groceryItemInstanceImage = groceryItemInstanceImage;
	}
	public String getGroceryItemInstanceName() {
		return groceryItemInstanceName;
	}
	public void setGroceryItemInstanceName(String groceryItemInstanceName) {
		this.groceryItemInstanceName = groceryItemInstanceName;
	}
	public String getGroceryItemQualityCategory() {
		return groceryItemQualityCategory;
	}
	public void setGroceryItemQualityCategory(String groceryItemQualityCategory) {
		this.groceryItemQualityCategory = groceryItemQualityCategory;
	}
	public String getGroceryItemMrp() {
		return groceryItemMrp;
	}
	public void setGroceryItemMrp(String groceryItemMrp) {
		this.groceryItemMrp = groceryItemMrp;
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
