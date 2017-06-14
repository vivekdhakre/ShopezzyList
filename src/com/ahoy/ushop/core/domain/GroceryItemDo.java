package com.ahoy.ushop.core.domain;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(value = {"groceryCategoryFkey","createdBy","createdOn","updatedBy","updatedOn"})
public class GroceryItemDo {
	
	@JsonProperty("id")
	private long groceryItemPkey;
	@JsonProperty("name")
	private String itemName;
//	private long groceryCategoryFkey;
	@JsonProperty("imageUrl")
	private String groceryItemImage;
	@JsonProperty("quantity")
	private String groceryItemQuantity;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	public String getGroceryItemQuantity() {
		return groceryItemQuantity;
	}
	public void setGroceryItemQuantity(String groceryItemQuantity) {
		this.groceryItemQuantity = groceryItemQuantity;
	}
	public String getGroceryItemImage() {
		return groceryItemImage;
	}
	public void setGroceryItemImage(String groceryItemImage) {
		this.groceryItemImage = groceryItemImage;
	}
	public long getGroceryItemPkey() {
		return groceryItemPkey;
	}
	public void setGroceryItemPkey(long groceryItemPkey) {
		this.groceryItemPkey = groceryItemPkey;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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
