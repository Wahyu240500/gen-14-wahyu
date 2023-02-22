package com.prodemy.gen14.BangunDatar;

public class BelahKetupat extends BangunDatar {
private double sisi, diagonal1, diagonal2;
	
//CONSTRUCTOR
	public BelahKetupat(double sisi, double diagonal1, double diagonal2) {
		super();
		this.sisi = sisi;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

//GETTER
	public double getSisi() {
		return sisi;
	}
	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	public double getDiagonal1() {
		return diagonal1;
	}
	
// SETTER	
	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}
	public double getDiagonal2() {
		return diagonal2;
	}
	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}
	
	
	public String keliling() {
		keliling = 4*sisi;
		return "Keliling Belah Ketupat = " +keliling+ " m";	
	}
	
	public String luas() {
		luas = (diagonal1*diagonal2)/2;
		return "Luas Belah Ketupat = " +luas+ " m";
	}
}
