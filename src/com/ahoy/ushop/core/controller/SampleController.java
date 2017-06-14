package com.ahoy.ushop.core.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("/test")
	public String test(){
		
		String resp = null;
		
		try{
			
			
		}catch(Exception e){
			logger.error("[test] "+e);
		}
		
		
		
		return resp;
		
	}	
	
	public static void main(String []args){
		
		try{
			File f = new File("/media/vivek/New Volume/ushopImages/items");
			String[] categoryFolder = f.list();
			System.out.println(f.getPath());
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("bakery",12);
			map.put("beauty_care",6);
			map.put("beverages",3);
			map.put("dairy_&_frozen",5);
			map.put("easy_to_cook_&_eat",13);
			map.put("eggs_&_non-veg",14);
			map.put("food_mart",1);
			map.put("friuts",10);
			map.put("gentleman_care",7);
			map.put("health_&_baby_care",9);
			map.put("home_care",8);
			map.put("snacks",4);
			map.put("spice_&_oils",2);
			map.put("vegetables",11);
			
			String query = "update grocery_item set grocery_item_pkey=<CATEGORYNAME>  where grocery_item_image='<IMAGE-NAME>';";
			
			for(String fname: categoryFolder){
//				System.out.println(fname);
				f = new File("/media/vivek/New Volume/ushopImages/items/"+fname);
				String[] listFiles = f.list();
				for(String fileName: listFiles){
					String str = query.replace("<IMAGE-NAME>", fileName)
							.replace("<CATEGORYNAME>", map.get(fname)+"");
					System.out.println(str);					
				}
				
				
			}
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
