package com.bareminds.TempleApp.Service;

import java.util.List;

import com.bareminds.TempleApp.dto.DonationReaquest;
import com.bareminds.TempleApp.models.Temple;


public interface Temple_Service {
	
	Temple SveTemple(DonationReaquest request);
	List<Temple> getAllTempleDetails();
	Temple getTempleById(long id);
	Temple updateTempleById(Temple temple, long id);
	void deleteTempleById(long id);
    
}
