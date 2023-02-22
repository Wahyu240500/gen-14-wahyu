package com.prodemy.gen14.BangunDatar;

public class Persegi extends BangunDatar{
private double sisi;

//CONSTRUCTOR
	public Persegi(double sisi) {
		super();
		this.sisi = sisi;
	}

// GETTER
	public double getSisi() {
		return sisi;
	}
	
//SETTER
	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	
	
	public String keliling() {
		keliling = 4*sisi;
		return "Keliling Persegi = " +keliling+ " m";	
	}
	
	public String luas() {
		luas = sisi*sisi;
		return "Luas Persegi = " +luas+ " m";
	}
}
