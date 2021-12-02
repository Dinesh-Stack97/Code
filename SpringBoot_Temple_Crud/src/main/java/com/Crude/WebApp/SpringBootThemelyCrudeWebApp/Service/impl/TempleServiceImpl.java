package com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Exception.Spring_Boot_Apk_Exception;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Repositery.DonationRepository;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Repositery.TempleRepository;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Service.Temple_Service;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.models.Donations;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.models.Temple;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.request.DonationRequest;

@Service
public class TempleServiceImpl implements Temple_Service{
	
	@Autowired
	private TempleRepository templeRepository;
	
	private DonationRepository donationRepository;

	public TempleServiceImpl(TempleRepository templeRepository) {
		super();
		this.templeRepository = templeRepository;
	}



	public List<Temple> getAllTempleDetails() {
		// TODO Auto-generated method stub
		return templeRepository.findAll();
	}



	public Temple SveTemple(DonationRequest request) {
		// TODO Auto-generated method stub
		  Temple temple = new Temple();
		   temple.setTempleName(request.getTemple());
		  temple = templeRepository.save(temple);
		   Donations donation = new Donations(request);
		   donation.setTemple(temple);
		   
		   donation = donationRepository.save(donation);
		return templeRepository.save(temple);
	}



	@Override
	public Temple getTempleById(long id) {
		// TODO Auto-generated method stub
		return templeRepository.findById(id).orElseThrow(() -> new Spring_Boot_Apk_Exception("TempleProfile", "id", id));
	}



	@Override
	public Temple updateTempleById(Temple temple, long id) {
		// TODO Auto-generated method stub
		Temple ExixstingTemplePrrofile = templeRepository.findById(id).orElseThrow(() -> new Spring_Boot_Apk_Exception("TempleProfile", "id", id));
		ExixstingTemplePrrofile.setTempleName(temple.getTempleName());
		ExixstingTemplePrrofile.setWorshipped_God(temple.getWorshipped_God());
		ExixstingTemplePrrofile.setPriestName(temple.getPriestName());
		ExixstingTemplePrrofile.setNo_of_dining_Halls(temple.getNo_of_dining_Halls());
		ExixstingTemplePrrofile.setNo_Of_Pooja_Mandirs(temple.getNo_Of_Pooja_Mandirs());
		ExixstingTemplePrrofile.setEmail(temple.getEmail());
		ExixstingTemplePrrofile.setPhoneNumber(temple.getPhoneNumber());
		ExixstingTemplePrrofile.setRevenue(temple.getRevenue());
		ExixstingTemplePrrofile.setExpences(temple.getExpences());
	
		
		templeRepository.save(ExixstingTemplePrrofile);
		return  ExixstingTemplePrrofile;
	}



	@Override
	public void deleteTempleById(long id) {
		// TODO Auto-generated method stub
		templeRepository.findById(id).orElseThrow(() -> new Spring_Boot_Apk_Exception("TemplePRofile", "id", id));
		templeRepository.deleteById(id);
	}



	@Override
	public Temple SveTemple(Temple temple) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
