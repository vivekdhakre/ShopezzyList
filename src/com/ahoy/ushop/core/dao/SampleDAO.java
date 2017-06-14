package com.ahoy.ushop.core.dao;
import java.util.List;
 

public interface SampleDAO {
	
	public void addEvent(String event);
	//public List<CategoryDo> listCategory();
	public void removeEvent(long id);
	public String getEventById(long id);
}
