package com.bareminds.TempleApp.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bareminds.TempleApp.models.Donations;
import com.bareminds.TempleApp.models.Temple;


public interface TempleRepository  extends JpaRepository<Temple, Long>{

	

}
