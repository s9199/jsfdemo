package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Insurance;
@ApplicationScoped
public class InsuranceManager {
	private List<Insurance> nc = new ArrayList <Insurance>();
	
	public void addInsurance(Insurance parametrInsurance){
		Insurance newInsurance= new Insurance();
		newInsurance.setName(parametrInsurance.getName());
		newInsurance.setKind(parametrInsurance.getKind());
		newInsurance.setVin(parametrInsurance.getVin());
		
		nc.add(newInsurance);	
	}
	public List<Insurance>getAllInsurance(){
		return nc;
	}

}
