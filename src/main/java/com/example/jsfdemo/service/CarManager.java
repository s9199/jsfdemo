package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.example.jsfdemo.domain.Agency;
import com.example.jsfdemo.domain.Car;
import com.example.jsfdemo.domain.Person;

@ApplicationScoped
public class CarManager {
	private List<Car> rs = new ArrayList<Car>();

	@Inject
	private PersonManager personManager;

	public Car get(String licenceplate) {
		for (Car c : rs)
			if (c.getLicenceplate() == licenceplate)
				return c;
		return null;
	}

	public void addCar(Car car, Object p) {
		if (car.getLicenceplate() == null)
			return;
		// Person p = personManager.get(car.getLicenceplate().getName());
		if (p != null) {
			((Person) p).getCars().add(car);
		}
	
		Car c = get(car.getName());
		if (c == null)
			rs.add(car);
		else {
			c.setName(car.getName());
			c.setLicenceplate(car.getLicenceplate());
			c.setModel(car.getModel());
			c.setColor(car.getColor());
		}
		Car newCar = new Car();
		rs.add(newCar);
	}

	public void updateCar(Car car) {
		for (Car c : rs) {
			if (car.getModel().equals(c.getModel())) {
				c.setModel(car.getModel());
				c.setColor(car.getColor());
				c.setLicenceplate(car.getLicenceplate());
				c.setName(car.getName());
			}
		}
	}

	public void deleteCar(Car car) {
		Car carToRemove = null;
		for (Car c : rs) {
			if (car.getModel().equals(c.getModel())) {
				carToRemove = c;
				break;
			}
		}
	}

	public List<Car> getAllCars() {
		return rs;
	}

}
