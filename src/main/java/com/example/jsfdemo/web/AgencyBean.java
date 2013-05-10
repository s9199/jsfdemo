package com.example.jsfdemo.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Agency;
import com.example.jsfdemo.service.AgencyManager;

@SessionScoped
// nie ma być widocznie dla innych
@Named("agencyBean")
public class AgencyBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Agency agencja = new Agency();
	private ListDataModel<Agency> agencje = new ListDataModel<Agency>();

	@Inject
	private AgencyManager am;
	
	public Agency getAgencja ()
	{
		return agencja;
	}
	public void setAgencja(Agency ag){
		this.agencja=ag;
	}
	
	public ListDataModel<Agency>getAllAgencies(){
		agencje.setWrappedData(am.getAllAgencies());
		return agencje;
	}
	
	//Akcja
	public String addAgency(){
		am.addAgency(agencja);
		return "showAgency";
	}

}
