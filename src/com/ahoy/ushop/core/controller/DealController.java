package com.ahoy.ushop.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahoy.ushop.core.domain.DealDo;
import com.ahoy.ushop.core.domain.GroceryCategoryDo;
import com.ahoy.ushop.core.domain.GroceryItemDo;
import com.ahoy.ushop.core.domain.GroceryItemInstanceDo;
import com.ahoy.ushop.core.domain.GroceryStoreDo;
import com.ahoy.ushop.core.service.DealManagementService;
import com.ahoy.ushop.core.service.GroceryItemManagementService;

@Controller
public class DealController {

	@Autowired 
	private DealManagementService dealManagementService;
	
	@RequestMapping(value = "/getDeals")
	public @ResponseBody List<Offer> getDeals(@RequestParam(required = false, value = "item") String item ) {
		
		List<Offer> list = new ArrayList<Offer>();
		list.add(new Offer(1,"Bigbajar noida","buy one get one","http://5.9.110.23/ushopImages/items/spice_&_oils/refined.png","http://ads.uahoy.in/campaign/pediasure"));
		list.add(new Offer(8,"Bigbajar delgi","buy one get three","http://5.9.110.23/ushopImages/items/spice_&_oils/refined.png","http://ads.uahoy.in/campaign/pediasure"));
		list.add(new Offer(4,"lifestyle noida","buy two get three","http://5.9.110.23/ushopImages/items/spice_&_oils/refined.png","http://ads.uahoy.in/campaign/pediasure"));
		
		return list;
		
	}
	class Offer{
		
		
		
		private int id; 
		private String groceryStore;
		private String deal;
		private String imageUrl;
		private String dealUrl;
		 
		public   Offer(int id,String groceryStore,String deal,String imageUrl,String dealUrl) {
			this.id=id;
			this.groceryStore=groceryStore;
			this.deal=deal;
			this.imageUrl=imageUrl;
			this.dealUrl=dealUrl;
		}
		public String getDealUrl() {
			return dealUrl;
		}

		public void setDealUrl(String dealUrl) {
			this.dealUrl = dealUrl;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getGroceryStore() {
			return groceryStore;
		}
		public void setGroceryStore(String groceryStore) {
			this.groceryStore = groceryStore;
		}
		public String getDeal() {
			return deal;
		}
		public void setDeal(String deal) {
			this.deal = deal;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		 
	}  
}
