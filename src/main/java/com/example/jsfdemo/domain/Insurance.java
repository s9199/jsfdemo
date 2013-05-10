package com.example.jsfdemo.domain;

public class Insurance {
	private String name;
	private String kind;
	private String vin;
	
	public String getName(){
		return name;
		}
	public void setName(String name){
		this.name=name;
	}
	public String getKind(){
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

	
}
