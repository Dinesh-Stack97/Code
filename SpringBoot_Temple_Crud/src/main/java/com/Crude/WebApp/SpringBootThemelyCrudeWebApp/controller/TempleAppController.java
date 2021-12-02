package com.Crude.WebApp.SpringBootThemelyCrudeWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Repositery.DonationRepository;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Repositery.TempleRepository;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Service.Temple_Service;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.models.Donations;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.models.Temple;
import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.request.DonationRequest;
//@restcontroller uses these two annotations internally
//@Controller-->To make normal java class has a spring mvc class so that it handle web request
//@ResponseBody             The rest apis should return jason or xml or other format
@RestController
@RequestMapping("/api/temple")
public class TempleAppController {
	
	private Temple_Service temple_Service;
	
	
	@Autowired
	private TempleRepository templeRepository;
	
	private DonationRepository donationRepository;
	


	public TempleAppController(Temple_Service temple_Service) {
		super();
		this.temple_Service = temple_Service;
	}

   @PostMapping("/saveTemple")
   public ResponseEntity<Donations> SaveTempleProfile(@RequestBody DonationRequest request)
   {
	   Temple temple = new Temple();
	   temple.setTempleName(request.getTemple());
	   temple = temple_Service.SveTemple(temple);
	   Donations donation = new Donations(request);
	   donation.setTemple(temple);

	   donation = donationRepository.save(donation);
	   return new ResponseEntity<Donations>(donation,HttpStatus.CREATED)
   }



	@GetMapping("/temples")
	public List<Temple> getTempleProfiles()
	{
		return temple_Service.getAllTempleDetails();
	}
	
	@GetMapping("{id}")
	public Temple GettempleById(@PathVariable("id") long id)
	{
		return temple_Service.getTempleById(id);
	}
	@PutMapping("{id}")
	public Temple UpdateTempleById(@RequestBody Temple temple,@PathVariable("id") long id)
	{
	        return temple_Service.updateTempleById(temple, id);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> DeleteTempleById(@PathVariable("id") long id)
	{
		temple_Service.deleteTempleById(id);
		return new ResponseEntity<String>("Temple Profile Deleted Successfully",HttpStatus.OK);
	}
	
}
