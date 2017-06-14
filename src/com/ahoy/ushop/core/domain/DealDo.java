package com.ahoy.ushop.core.domain;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;
//http://www.baeldung.com/jackson-ignore-properties-on-serialization
//@JsonSerialize(using = DealDo.class)
@JsonIgnoreProperties(value = {"dealPkey", "createdBy","createdOn","updatedBy","updatedOn"})
public class DealDo {
	 
	private long dealPkey;
	@JsonProperty("groceryItemInstance")
	private long groceryItemInstanceFkey;
	@JsonProperty("groceryStore")
	private long groceryStoreFkey;
	@JsonProperty("groceryItem")
	private long groceryItemFkey;
	private String dealExplanation;
	private String dealImage;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	
	public String getDealImage() {
		return dealImage;
	}
	public void setDealImage(String dealImage) {
		this.dealImage = dealImage;
	}
	public long getDealPkey() {
		return dealPkey;
	}
	public void setDealPkey(long dealPkey) {
		this.dealPkey = dealPkey;
	}
	
	public long getGroceryItemInstanceFkey() {
		return groceryItemInstanceFkey;
	}
	public void setGroceryItemInstanceFkey(long groceryItemInstanceFkey) {
		this.groceryItemInstanceFkey = groceryItemInstanceFkey;
	}
	public long getGroceryStoreFkey() {
		return groceryStoreFkey;
	}
	public void setGroceryStoreFkey(long groceryStoreFkey) {
		this.groceryStoreFkey = groceryStoreFkey;
	}
	public long getGroceryItemFkey() {
		return groceryItemFkey;
	}
	public void setGroceryItemFkey(long groceryItemFkey) {
		this.groceryItemFkey = groceryItemFkey;
	}
	public String getDealExplanation() {
		return dealExplanation;
	}
	public void setDealExplanation(String dealExplanation) {
		this.dealExplanation = dealExplanation;
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
