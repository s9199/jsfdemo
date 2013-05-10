package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Agency;

@ApplicationScoped // Zasięg aplikacji, widoczny dla innych 
public class AgencyManager {
	// Lista obiektów klasy Agencja
	private List<Agency> db= new ArrayList<Agency>();
	
	public void addAgency(Agency parametrAgencja){
		Agency newAgency = new Agency();
		newAgency.setCodeNumber(parametrAgencja.getCodeNumber());
		newAgency.setName(parametrAgencja.getName());
		newAgency.setEmail(parametrAgencja.getEmail());
		newAgency.setPhoneNumber(parametrAgencja.getPhoneNumber());
		
		
		db.add(newAgency);
	}

	public List<Agency> getAllAgencies(){
		return db;
	}
	
}
