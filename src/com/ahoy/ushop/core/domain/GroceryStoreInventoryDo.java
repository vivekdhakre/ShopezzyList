package com.ahoy.ushop.core.domain;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

public class GroceryStoreInventoryDo {
	
	private long groceryStoreInventoryPkey;
	@JsonProperty("groceryStoreBranch")
	private long groceryStoreBranchFkey;
	@JsonProperty("groceryItemInstance")
	private long groceryItemInstanceFkey;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	public long getGroceryStoreInventoryPkey() {
		return groceryStoreInventoryPkey;
	}
	public void setGroceryStoreInventoryPkey(long groceryStoreInventoryPkey) {
		this.groceryStoreInventoryPkey = groceryStoreInventoryPkey;
	}
	public long getGroceryStoreBranchFkey() {
		return groceryStoreBranchFkey;
	}
	public void setGroceryStoreBranchFkey(long groceryStoreBranchFkey) {
		this.groceryStoreBranchFkey = groceryStoreBranchFkey;
	}
	public long getGroceryItemInstanceFkey() {
		return groceryItemInstanceFkey;
	}
	public void setGroceryItemInstanceFkey(long groceryItemInstanceFkey) {
		this.groceryItemInstanceFkey = groceryItemInstanceFkey;
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
