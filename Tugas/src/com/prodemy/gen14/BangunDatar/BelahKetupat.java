package com.prodemy.gen14.BangunDatar;

public class BelahKetupat {
	int sisi, diagonal1, diagonal2;
	
	public BelahKetupat () {	
	}
	
	public BelahKetupat(int sisi, int diagonal1, int diagonal2) {
		super();
		this.sisi = sisi;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	public int getSisi() {
		return sisi;
	}

	public void setSisi(int sisi) {
		this.sisi = sisi;
	}

	public int getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(int diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public int getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(int diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public int kelilingBelahKetupat(int sisi) {
		int hasil;
		hasil = 4*sisi;
		return hasil; 
	}
	
	public int luasBelahKetupat(int diagonal1, int diagonal2) {
		int hasil;
		hasil = (diagonal1*diagonal2)/2;
		return hasil;
	}
}
