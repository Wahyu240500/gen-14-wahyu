package com.prodemy.gen14.BangunDatar;

public class Main {
public static void main(String[] args) {		
		
		Segitiga segitiga = new Segitiga(4,4,4,4,4);
		Persegi persegi = new Persegi(4);
		Lingkaran lingkaran = new Lingkaran(4);
		BelahKetupat belahKetupat = new BelahKetupat(4,4,4);
		
		BangunDatar[] kumpulanBangunDatar = {segitiga,persegi,lingkaran,belahKetupat};
		{
		for (BangunDatar i : kumpulanBangunDatar) {
			System.out.println(i.keliling());
			System.out.println(i.luas());
			}
		}

	}
}
