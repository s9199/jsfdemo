package com.example.jsfdemo.domain;

public class Car {
	private String licenceplate;
	private String model;
	private String name;
	private String color;


	public static String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model=model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLicenceplate() {
		return licenceplate;
	}
	public void setLicenceplate(String licenceplate) {
		this.licenceplate = licenceplate;
	}
}
