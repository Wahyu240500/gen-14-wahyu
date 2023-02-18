package com.prodemy.gen14.BangunDatar;

public class Persegi {
	int sisi;
	
	public Persegi () {	
	}
	public Persegi(int sisi) {
		super();
		this.sisi = sisi;
	}
	public int getSisi() {
		return sisi;
	}
	public void setSisi(int sisi) {
		this.sisi = sisi;
	}
	public int kelilingPersegi(int sisi) {
		int hasil;
		hasil = 4*sisi;
		return hasil; 
	}
	
	public int luasPersegi(int sisi) {
		int hasil;
		hasil = sisi*sisi;
		return hasil;
	}

	
}
