package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.Iterator;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Car;
import com.example.jsfdemo.service.CarManager;

@SessionScoped
//nie ma być widocznie dla innych
@Named("carBean")
public class CarBean implements Serializable{
	private static final long serialVersionUID=1l;
	private Car autko= new Car();
	private ListDataModel<Car> autka = new ListDataModel<Car>();

	@Inject
	private CarManager cm;
	
	public Car getAutko(){
		return autko;
	}
	
	public void setAutko(Car brum){
		this.autko=brum;
	}
	
	public ListDataModel<Car>getAllCars(){
		autka.setWrappedData(cm.getAllCars());
		return autka;
	}
	
	//Akcja
	public String addCars(){
		cm.addCar(autko);
		return "showCar";
	}
	
	public String editCar(){
		Iterator <Car> i = autka.iterator();
		return "nextCar";
	}
	public String deleteCar(){
		Car carToDelete=autka.getRowData();
		cm.deleteCar(carToDelete);
		return null;
	}
}


