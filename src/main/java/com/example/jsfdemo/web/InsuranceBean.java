package com.example.jsfdemo.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Insurance;
import com.example.jsfdemo.service.InsuranceManager;

@SessionScoped
//nie ma być widocznie dla innych
@Named("insuranceBean")
	public class InsuranceBean implements Serializable{
		private static final long serialVersionUID=1l;
		private Insurance polisa= new Insurance();
		private ListDataModel<Insurance> polisy = new ListDataModel<Insurance>();

		@Inject
		private InsuranceManager im;
		
		public Insurance getPolisa(){
			return polisa;
		}
		
		public void setPolisa(Insurance ubezpieczenie){
			this.polisa=ubezpieczenie;
		}
		
		public ListDataModel<Insurance>getAllInsurance(){
			polisy.setWrappedData(im.getAllInsurance());
			return polisy;
		}
		
		//Akcja
		public String addPolisa(){
			im.addInsurance(polisa);
			return "showInsurance";
		}
	}



