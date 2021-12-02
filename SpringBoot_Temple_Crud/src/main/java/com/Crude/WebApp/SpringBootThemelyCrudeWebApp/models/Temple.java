package com.Crude.WebApp.SpringBootThemelyCrudeWebApp.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "templeDB")
public class Temple {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "temple_name")
	private String templeName;

	@Column(name = "priest_name")
	private String priestName;

	@Column(name = "phone_number")
	private long phoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "Dining_Halls")
	private int no_of_dining_Halls;

	@Column(name = "revenue")
	private double revenue;

	@Column(name = "expences")
	private double expences;
	
	
	
	@Column(name="Pooja_Mandirs")
	private int no_Of_Pooja_Mandirs;
	
	@Column(name = "Worshiped_God")
	private String worshipped_God;

	public Temple(long id, String templeName, String priestName, long phoneNumber, String email, int no_of_dining_Halls,
			double revenue, double expences, int no_Of_Pooja_Mandirs, String worshipped_God) {
		super();
		this.id = id;
		this.templeName = templeName;
		this.priestName = priestName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.no_of_dining_Halls = no_of_dining_Halls;
		this.revenue = revenue;
		this.expences = expences;
		this.no_Of_Pooja_Mandirs = no_Of_Pooja_Mandirs;
		this.worshipped_God = worshipped_God;
	}

	public Temple() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTempleName() {
		return templeName;
	}

	public void setTempleName(String templeName) {
		this.templeName = templeName;
	}

	public String getPriestName() {
		return priestName;
	}

	public void setPriestName(String priestName) {
		this.priestName = priestName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNo_of_dining_Halls() {
		return no_of_dining_Halls;
	}

	public void setNo_of_dining_Halls(int no_of_dining_Halls) {
		this.no_of_dining_Halls = no_of_dining_Halls;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public double getExpences() {
		return expences;
	}

	public void setExpences(double expences) {
		this.expences = expences;
	}

	public int getNo_Of_Pooja_Mandirs() {
		return no_Of_Pooja_Mandirs;
	}

	public void setNo_Of_Pooja_Mandirs(int no_Of_Pooja_Mandirs) {
		this.no_Of_Pooja_Mandirs = no_Of_Pooja_Mandirs;
	}

	public String getWorshipped_God() {
		return worshipped_God;
	}

	public void setWorshipped_God(String worshipped_God) {
		this.worshipped_God = worshipped_God;
	}
	

 







}
