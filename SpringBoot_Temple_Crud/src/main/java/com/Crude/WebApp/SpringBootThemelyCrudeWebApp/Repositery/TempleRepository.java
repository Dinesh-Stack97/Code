package com.Crude.WebApp.SpringBootThemelyCrudeWebApp.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Crude.WebApp.SpringBootThemelyCrudeWebApp.models.Temple;


public interface TempleRepository  extends JpaRepository<Temple, Long>{

}
