package com.ahoy.ushop.core.domain;

import java.util.Date;
import com.ahoy.ushop.core.custom.*;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
@JsonSerialize(using = UserShoppingListSerializer.class)
@JsonDeserialize(using = UserShoppingListDeserializer.class)
public class UserShoppingListDo {
 
	private long userShoppingListPkey;
	@JsonProperty("userAppId")
	private long userFkey;
	@JsonProperty("items")
	private String itemListJson;
	//not for database
	private String userAppId;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	public String getUserAppId() {
		return userAppId;
	}
	public void setUserAppId(String userAppId) {
		this.userAppId = userAppId;
	}
	public long getUserShoppingListPkey() {
		return userShoppingListPkey;
	}
	public void setUserShoppingListPkey(long userShoppingListPkey) {
		this.userShoppingListPkey = userShoppingListPkey;
	}
	
	public long getUserFkey() {
		return userFkey;
	}
	public void setUserFkey(long userFkey) {
		this.userFkey = userFkey;
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
