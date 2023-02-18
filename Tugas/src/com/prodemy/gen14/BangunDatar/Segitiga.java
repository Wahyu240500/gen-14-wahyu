package com.prodemy.gen14.BangunDatar;

public class Segitiga {
	int alas, tinggi, sisiSegitiga1, sisiSegitiga2, sisiSegitiga3;
	public Segitiga () {	
	}
	public Segitiga(int alas, int tinggi, int sisiSegitiga1, int sisiSegitiga2, int sisiSegitiga3) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiSegitiga1 = sisiSegitiga1;
		this.sisiSegitiga2 = sisiSegitiga2;
		this.sisiSegitiga3 = sisiSegitiga3;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public int getTinggi() {
		return tinggi;
	}

	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

	public int getSisiSegitiga1() {
		return sisiSegitiga1;
	}

	public void setSisiSegitiga1(int sisiSegitiga1) {
		this.sisiSegitiga1 = sisiSegitiga1;
	}

	public int getSisiSegitiga2() {
		return sisiSegitiga2;
	}

	public void setSisiSegitiga2(int sisiSegitiga2) {
		this.sisiSegitiga2 = sisiSegitiga2;
	}

	public int getSisiSegitiga3() {
		return sisiSegitiga3;
	}

	public void setSisiSegitiga3(int sisiSegitiga3) {
		this.sisiSegitiga3 = sisiSegitiga3;
	}
	
	public int kelilingSegitiga(int sisiSegitiga1, int sisiSegitiga2, int sisiSegitiga3) {
		int hasil;
		hasil = sisiSegitiga1 + sisiSegitiga2 + sisiSegitiga3;
		return hasil; 
	}
	
	public int luasSegitiga(int alas, int tinggi) {
		int hasil;
		hasil = alas*tinggi/2;
		return hasil;
	}

	
}
