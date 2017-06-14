package com.ahoy.ushop.core.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(value = {"groceryCategoryOrderOne","groceryCategoryOrderTwo","groceryCategoryOrderThree","groceryCategoryOrderFour", "createdBy","createdOn","updatedBy","updatedOn"})
public class GroceryCategoryDo {

//	grocery_category_pkey bigint UNSIGNED NOT NULL auto_increment,
//	grocery_category_name varchar(100) ,
	 
	@JsonProperty("id")
	private long groceryCategoryPkey;
	@JsonProperty("name")
	private String groceryCategoryName;
	@JsonProperty("imageUrl")
	private String groceryCategoryImage;
	//not for db
	private List<GroceryItemDo> items=new ArrayList<GroceryItemDo>();
	private int groceryCategoryOrderOne;
	private int groceryCategoryOrderTwo;
	private int groceryCategoryOrderThree;
	private int groceryCategoryOrderFour;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	public int getGroceryCategoryOrderOne() {
		return groceryCategoryOrderOne;
	}
	public void setGroceryCategoryOrderOne(int groceryCategoryOrderOne) {
		this.groceryCategoryOrderOne = groceryCategoryOrderOne;
	}
	public int getGroceryCategoryOrderTwo() {
		return groceryCategoryOrderTwo;
	}
	public void setGroceryCategoryOrderTwo(int groceryCategoryOrderTwo) {
		this.groceryCategoryOrderTwo = groceryCategoryOrderTwo;
	}
	public int getGroceryCategoryOrderThree() {
		return groceryCategoryOrderThree;
	}
	public void setGroceryCategoryOrderThree(int groceryCategoryOrderThree) {
		this.groceryCategoryOrderThree = groceryCategoryOrderThree;
	}
	public int getGroceryCategoryOrderFour() {
		return groceryCategoryOrderFour;
	}
	public void setGroceryCategoryOrderFour(int groceryCategoryOrderFour) {
		this.groceryCategoryOrderFour = groceryCategoryOrderFour;
	}
	public List<GroceryItemDo> getItems() {
		return items;
	}
	public void setItems(List<GroceryItemDo> items) {
		this.items = items;
	}
	public String getGroceryCategoryImage() {
		return groceryCategoryImage;
	}
	public void setGroceryCategoryImage(String groceryCategoryImage) {
		this.groceryCategoryImage = groceryCategoryImage;
	}
	public long getGroceryCategoryPkey() {
		return groceryCategoryPkey;
	}
	public void setGroceryCategoryPkey(long groceryCategoryPkey) {
		this.groceryCategoryPkey = groceryCategoryPkey;
	}
	public String getGroceryCategoryName() {
		return groceryCategoryName;
	}
	public void setGroceryCategoryName(String groceryCategoryName) {
		this.groceryCategoryName = groceryCategoryName;
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
	
//	@Override
//	public boolean equals(Object object){
//		
//		boolean result = false;
//		if (object == null || object.getClass() != getClass()) {
//			result = false;
//		} else {
//			GroceryCategoryDo groceryCategoryDo = (GroceryCategoryDo) object;
//			if (this.getGroceryCategoryName().equals(groceryCategoryDo.getGroceryCategoryName())) {
//				result = true;
//			}
//		}
//		return result;
//		
//	}
//	@Override
//	public int hashCode() {
//		return this.getGroceryCategoryName().hashCode();
//	}
}
