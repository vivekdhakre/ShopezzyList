package com.ahoy.ushop.core.domain;

import java.util.Date;

public class FamilyCategoryDo {

//	family_category_pkey bigint UNSIGNED NOT NULL auto_increment,
//	family_category_name varchar(100) ,
	
	private long familyCategoryPkey;
	private String familyCategoryName;
	
	
	private String createdBy="admin";
	private Date createdOn;
	private String updatedBy="admin";
	private Date updatedOn;
	
	
	public long getFamilyCategoryPkey() {
		return familyCategoryPkey;
	}
	public void setFamilyCategoryPkey(long familyCategoryPkey) {
		this.familyCategoryPkey = familyCategoryPkey;
	}
	public String getFamilyCategoryName() {
		return familyCategoryName;
	}
	public void setFamilyCategoryName(String familyCategoryName) {
		this.familyCategoryName = familyCategoryName;
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
