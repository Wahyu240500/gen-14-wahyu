package com.prodemy.gen14.BangunDatar;

public class Lingkaran {
	int jariJari;
	float phi = 3.14F;
	
	public Lingkaran () {	
	}
	public Lingkaran(int jariJari) {
		super();
		this.jariJari = jariJari;
		//this.phi = phi;
	}
	public int getJariJari() {
		return jariJari;
	}
	public void setJariJari(int jariJari) {
		this.jariJari = jariJari;
	}
	
	public int kelilingLingkaran(int jariJari) {
		int hasil;
		hasil = (int) (2* this.phi * jariJari);
		return hasil; 
	}
	
	public int luasLingkaran(int jariJari) {
		int hasil;
		hasil = (int) (this.phi * (jariJari * jariJari));
		return hasil;
	}	
}
