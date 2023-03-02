package com.prodemy.gen14.Tugas_4;

import java.io.Serializable;

public class Barang implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nama;
	private int harga;
	private int persediaan;
	
	Barang(){
		
	};
	
	public Barang(String nama, int harga, int persediaan) {
		this.nama = nama;
		this.harga = harga;
		this.persediaan = persediaan;
	}
	
	@Override
	public String toString() {
		return "Nama Barang:"+nama+" => Harga:"+harga+" =>Persediaan:"+persediaan;
	}
	

}
