package com.prodemy.gen14.BangunDatar;

public class Lingkaran extends BangunDatar {
private double jariJari;
	
// CONSTRUCTOR
	public Lingkaran(double jariJari) {
		super();
		this.jariJari = jariJari;
	}

//GETTER
	public double getJariJari() {
		return jariJari;
	}
	
// SETTER
	public void setJariJari(double jariJari) {
		this.jariJari = jariJari;
	}

	
	public String keliling() {
		keliling = 2*3.14*jariJari;
		return "Keliling Lingkaran = " +keliling+ " m";	
	}
	
	public String luas() {
		luas = 3.14*jariJari*jariJari;
		return "Luas Lingkaran = " +luas+ " m";
	}	
}
