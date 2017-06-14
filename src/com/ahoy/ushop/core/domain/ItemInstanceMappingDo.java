package com.ahoy.ushop.core.domain;

import java.util.Date;

public class ItemInstanceMappingDo {
	 
	private long itemInstanceMappingPkey;
	private long mappingFkey;
	private long itemInstanceFkey;
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	public long getItemInstanceMappingPkey() {
		return itemInstanceMappingPkey;
	}
	public void setItemInstanceMappingPkey(long itemInstanceMappingPkey) {
		this.itemInstanceMappingPkey = itemInstanceMappingPkey;
	}
	public long getMappingFkey() {
		return mappingFkey;
	}
	public void setMappingFkey(long mappingFkey) {
		this.mappingFkey = mappingFkey;
	}
	public long getItemInstanceFkey() {
		return itemInstanceFkey;
	}
	public void setItemInstanceFkey(long itemInstanceFkey) {
		this.itemInstanceFkey = itemInstanceFkey;
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
