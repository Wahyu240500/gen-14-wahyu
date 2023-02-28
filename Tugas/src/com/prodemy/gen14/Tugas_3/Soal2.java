package com.prodemy.gen14.Tugas_3;

public class Soal2 {

	public static void main(String[] args) {
		String[] namaBarang = new String[4];
		int[] hargaBarang = new int[4];
		
		namaBarang[0] = "Oreo";
		hargaBarang[0] = 6000;
		
		namaBarang[1] = "Tanggo";
		hargaBarang[1] = 5000;

		namaBarang[2] = "Buavita";
		hargaBarang[2] = 7000;
		
		namaBarang[3] = "Aqua";
		hargaBarang[3] = 3000;
		
		int hargaTermahal = 0;
		String barangTermahal = "";
		
		int uang = 10000;
		System.out.println("Dengan memiliki uang sebesar Rp." + uang);
		
		
		for (int i=0; i<namaBarang.length; i++) {
			if (hargaBarang[i] <= uang && hargaBarang[i]> hargaTermahal) {
				hargaTermahal = hargaBarang[i];
				barangTermahal = namaBarang[i];
			}
		}
		System.out.println("Barang termahal yang dapat dibeli yaitu: "+barangTermahal+ ", yang memiliki harga sebesar: Rp."+hargaTermahal);
	}

}
