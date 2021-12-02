package com.Crude.WebApp.SpringBootThemelyCrudeWebApp.request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class DonationRequest {
	
	
		
		
		
		private String plots;
		
		
	    private String liveStocks;
		
		
	    private String groceries;
	    
		
	    private String Foundations;
	    
	
	    private String irrigation;
	    
		
	    private Double cash;
	    
	
	    private String OnlineDonations;
	    
		
	    private  String foodAndHeritage;
	    
	    private String Temple;


	

		public DonationRequest(String plots, String liveStocks, String groceries, String foundations, String irrigation,
				Double cash, String onlineDonations, String foodAndHeritage, String temple) {
			super();
			this.plots = plots;
			this.liveStocks = liveStocks;
			this.groceries = groceries;
			Foundations = foundations;
			this.irrigation = irrigation;
			this.cash = cash;
			OnlineDonations = onlineDonations;
			this.foodAndHeritage = foodAndHeritage;
			Temple = temple;
		}


		public String getPlots() {
			return plots;
		}


		public void setPlots(String plots) {
			this.plots = plots;
		}


		public String getLiveStocks() {
			return liveStocks;
		}


		public void setLiveStocks(String liveStocks) {
			this.liveStocks = liveStocks;
		}


		public String getGroceries() {
			return groceries;
		}


		public void setGroceries(String groceries) {
			this.groceries = groceries;
		}


		public String getFoundations() {
			return Foundations;
		}


		public void setFoundations(String foundations) {
			this.Foundations = foundations;
		}


		public String getIrrigation() {
			return irrigation;
		}


		public void setIrrigation(String irrigation) {
			this.irrigation = irrigation;
		}


		public Double getCash() {
			return cash;
		}


		public void setCash(Double cash) {
			this.cash = cash;
		}


		public String getOnlineDonations() {
			return OnlineDonations;
		}


		public void setOnlineDonations(String onlineDonations) {
			this.OnlineDonations = onlineDonations;
		}


		public String getFoodAndHeritage() {
			return foodAndHeritage;
		}


		public void setFoodAndHeritage(String foodAndHeritage) {
			this.foodAndHeritage = foodAndHeritage;
		}

	
		public String getTemple() {
			return Temple;
		}
		
		public void setTemple(String temple) {
			this.Temple = temple;
		}

}

