package com.bareminds.TempleApp.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bareminds.TempleApp.models.Donations;

public interface DonationsRepository extends JpaRepository<Donations,Integer> {

}
