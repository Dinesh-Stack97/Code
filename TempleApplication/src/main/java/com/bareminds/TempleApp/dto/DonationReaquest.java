package com.bareminds.TempleApp.dto;

import javax.annotation.sql.DataSourceDefinition;

import com.bareminds.TempleApp.models.Donations;
import com.bareminds.TempleApp.models.Temple;

public class DonationReaquest {
	
 private Temple temple;

public DonationReaquest() {
	super();
	// TODO Auto-generated constructor stub
}

public DonationReaquest(Temple temple) {
	super();
	this.temple = temple;
}

public Temple getTemple() {
	return temple;
}

public void setTemple(Temple temple) {
	this.temple = temple;
}
 
}

