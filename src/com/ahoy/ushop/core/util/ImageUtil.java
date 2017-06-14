package com.ahoy.ushop.core.util;

public class ImageUtil {

	public static String getImageUrl(String imageName){
		//return "localhost:8888/ushopImages/items/"+imageName;
		//System.out.println(imageName+"================================================");
		
		if(!imageName.contains("http"))
			imageName= "http://5.9.110.23/ushopImages/items/"+imageName;
		return imageName;
			
	}
}