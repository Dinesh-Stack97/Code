package com.bareminds.TempleApp.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Donations")
public class Donations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="donaion_Id")
	private int donationId;
	
	@Column(name="plots")
	private String plots;
	
	@Column(name="LiveStocks")
    private String liveStocks;
	
	@Column(name="Groceries")
    private String groceries;
    
	@Column(name="Foundations")
    private String Foundations;
    
	@Column(name="Irrigation")
    private String irrigation;
    
	@Column(name="Cash")
    private Double cash;
    
	@Column(name="OnlineDonations")
    private String OnlineDonations;
    
	@Column(name="Food_Heritage")
    private  String foodAndHeritage;

	public Donations(int donationId, String plots, String liveStocks, String groceries, String foundations,
			String irrigation, Double cash, String onlineDonations, String foodAndHeritage) {
		super();
		this.donationId = donationId;
		this.plots = plots;
		this.liveStocks = liveStocks;
		this.groceries = groceries;
		Foundations = foundations;
		this.irrigation = irrigation;
		this.cash = cash;
		OnlineDonations = onlineDonations;
		this.foodAndHeritage = foodAndHeritage;
	}

	public Donations() {
		// TODO Auto-generated constructor stub
	}

	public int getDonationId() {
		return donationId;
	}

	public void setDonationId(int donationId) {
		this.donationId = donationId;
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
		Foundations = foundations;
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
		OnlineDonations = onlineDonations;
	}

	public String getFoodAndHeritage() {
		return foodAndHeritage;
	}

	public void setFoodAndHeritage(String foodAndHeritage) {
		this.foodAndHeritage = foodAndHeritage;
	}
	
	
	




	
	
}
