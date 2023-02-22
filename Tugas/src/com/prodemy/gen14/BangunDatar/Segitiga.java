package com.prodemy.gen14.BangunDatar;

public class Segitiga extends BangunDatar {
	private double alas, tinggi, sisiSegitiga1, sisiSegitiga2, sisiSegitiga3;

// CONSTRUCTOR
	public Segitiga(double alas, double tinggi, double sisiSegitiga1, double sisiSegitiga2, double sisiSegitiga3) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiSegitiga1 = sisiSegitiga1;
		this.sisiSegitiga2 = sisiSegitiga2;
		this.sisiSegitiga3 = sisiSegitiga3;
	}

//GETTER
	public double getAlas() {
		return alas;
	}
	public double getTinggi() {
		return tinggi;
	}
	public double getSisiSegitiga1() {
		return sisiSegitiga1;
	}
	public double getSisiSegitiga2() {
		return sisiSegitiga2;
	}
	public double getSisiSegitiga3() {
		return sisiSegitiga3;
	}
	
//SETTER
	public void setAlas(double alas) {
		this.alas = alas;
	}
	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public void setSisiSegitiga1(double sisiSegitiga1) {
		this.sisiSegitiga1 = sisiSegitiga1;
	}
	public void setSisiSegitiga2(double sisiSegitiga2) {
		this.sisiSegitiga2 = sisiSegitiga2;
	}
	public void setSisiSegitiga3(double sisiSegitiga3) {
		this.sisiSegitiga3 = sisiSegitiga3;
	}
	public void setSisiSegitiga3(int sisiSegitiga3) {
		this.sisiSegitiga3 = sisiSegitiga3;
	}
	
	
	public String keliling() {
		keliling = sisiSegitiga1 + sisiSegitiga2 + sisiSegitiga3;
		return "Keliling Segitiga = " +keliling+ " m";	
	}
	
	public String luas() {
		luas = (alas*tinggi)/2;
		return "Luas segitiga = " +luas+ " m";
	}
}
