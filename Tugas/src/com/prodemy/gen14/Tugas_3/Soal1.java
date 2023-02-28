package com.prodemy.gen14.Tugas_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soal1 {
	static Character [] kumpulanVokal = new Character[] {'a','i','u','e','o'};
	static List<Character> ListVokal = new ArrayList<>();

	public static void main(String[] args) {
	ListVokal = Arrays.asList(kumpulanVokal);
	int vokal_a = 0;
	int vokal_i = 0;
	int vokal_u = 0;
	int vokal_e = 0;
	int vokal_o = 0;
	
	String kalimat = "Aku Belajar Pemrograman";
	List<Character>hasil = new ArrayList<>();
	
	for (int i=0; i<kalimat.length(); i++) {
		if (ListVokal.contains(kalimat.charAt(i))) {
			int pos = hasil.indexOf(kalimat.charAt(i));
			
			if (pos >= 0) {
				hasil.add(pos, kalimat.charAt(i));
			}else {
				hasil.add(kalimat.charAt(i));
			}
		}
	}
	System.out.println("Pada kalimat '" + kalimat + "' terdapat:");
	
	for (int i = 0; i <kalimat.length(); i++) {
		   if (kalimat.charAt(i)=='a' || kalimat.charAt(i)=='A') {
		    vokal_a++;
		   } else if (kalimat.charAt(i)=='i'|| kalimat.charAt(i)=='I') {
		    vokal_i++;
		   } else if (kalimat.charAt(i)=='u' || kalimat.charAt(i)=='U') {
		    vokal_u++;
		   } else if (kalimat.charAt(i)== 'e'|| kalimat.charAt(i)== 'E') {
		    vokal_e++;
		   } else if (kalimat.charAt(i)== 'o' || kalimat.charAt(i)== 'O') {
		    vokal_o++;
		   }
		  }
		  System.out.println("Jumlah huruf vokal a sebanyak: " +vokal_a);
		  System.out.println("Jumlah huruf vokal i sebanyak: " +vokal_i);
		  System.out.println("Jumlah huruf vokal u sebanyak: " +vokal_u);
		  System.out.println("Jumlah huruf vokal e sebanyak: " +vokal_e);
		  System.out.println("Jumlah huruf vokal o sebanyak: " +vokal_o);
	}
}
