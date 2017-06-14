package com.ahoy.ushop.core.domain;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class DefaultShoppingListDo {
	 
	private long defaultShoppingListPkey;
	@JsonProperty("familyCategory")
	private long familyCategoryFkey;
	private String itemListJson;
	private int timeGranularity;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	public int getTimeGranularity() {
		return timeGranularity;
	}
	public void setTimeGranularity(int timeGranularity) {
		this.timeGranularity = timeGranularity;
	}
	public long getDefaultShoppingListPkey() {
		return defaultShoppingListPkey;
	}
	public void setDefaultShoppingListPkey(long defaultShoppingListPkey) {
		this.defaultShoppingListPkey = defaultShoppingListPkey;
	}
	
	 
	public long getFamilyCategoryFkey() {
		return familyCategoryFkey;
	}
	public void setFamilyCategoryFkey(long familyCategoryFkey) {
		this.familyCategoryFkey = familyCategoryFkey;
	}
	public String getItemListJson() {
		return itemListJson;
	}
	public void setItemListJson(String itemListJson) {
		this.itemListJson = itemListJson;
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
