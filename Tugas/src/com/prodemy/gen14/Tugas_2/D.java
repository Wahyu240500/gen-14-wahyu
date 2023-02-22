package com.prodemy.gen14.Tugas_2;

public class D {

	public static void main(String[] args) {
		int n = (9);
		int ganjilAwal = 1;
		int ganjilAkhir = 17;
		
		for (int i =0; i<n; i++){
            for (int j =0; j<n; j++){
            	if(i==j) {
            		System.out.print(ganjilAwal);	
            	}
            	else if(i+j == n-1){
            		System.out.print(ganjilAkhir);     
            	} else {
                System.out.print(" ");
            	}
            }
            ganjilAwal = ganjilAwal + 2;
            ganjilAkhir = ganjilAkhir - 2;
            System.out.println();
		}
	}
	
}
