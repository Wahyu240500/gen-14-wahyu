package com.prodemy.gen14.BangunDatar;

public class BangunDatar {

	public static void main(String[] args) {
		
		String[] bangunDatar = {"Segitiga", "Persegi","Lingkaran","Belah Ketupat"};
		Segitiga s = new Segitiga();
		Persegi p = new Persegi();
		Lingkaran l = new Lingkaran();
		BelahKetupat b = new BelahKetupat();
		
		s.setAlas(4);
		s.setSisiSegitiga1(4);
		s.setSisiSegitiga2(4);
		s.setSisiSegitiga3(4);
		s.setTinggi(4);
		p.setSisi(6);
		l.setJariJari(7);
		b.setSisi(10);
		b.setDiagonal1(10);
		b.setDiagonal2(10);
		
		int kelilingBangunDatar[]= new int[4];
		kelilingBangunDatar[0]= s.kelilingSegitiga(s.getSisiSegitiga1(),s.getSisiSegitiga2(),s.getSisiSegitiga3());
		kelilingBangunDatar[1]= p.kelilingPersegi(p.getSisi());
		kelilingBangunDatar[2]= l.kelilingLingkaran(l.getJariJari());
		kelilingBangunDatar[3]= b.kelilingBelahKetupat(b.getSisi());
		for(int i=0; i < kelilingBangunDatar.length; i++) {
			System.out.println("Keliling " +bangunDatar[i]+" : "+ kelilingBangunDatar[i]);
		}
		int luasBangunDatar[]= new int[4];
		luasBangunDatar[0]= s.luasSegitiga(s.getAlas(),s.getTinggi());
		luasBangunDatar[1]= p.luasPersegi(p.getSisi());
		luasBangunDatar[2]= l.luasLingkaran(l.getJariJari());
		luasBangunDatar[3]= b.luasBelahKetupat(b.getDiagonal1(),b.getDiagonal2());
		for(int i=0; i < luasBangunDatar.length; i++) {
			System.out.println("Luas " + bangunDatar[i]+" : " + luasBangunDatar[i]);
		}	

	}

}
