package com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Service;

import java.util.List;

import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.models.Temple;


public interface Temple_Service {
	
	Temple SveTemple(Temple temple);
	List<Temple> getAllTempleDetails();
	Temple getTempleById(long id);
	Temple updateTempleById(Temple temple, long id);
	void deleteTempleById(long id);
    
}
