package com.prodemy.gen14.Tugas_2;

public class B {

	public static void main(String[] args) {
		int n = (9);
		int m = (5);
		
		for (int i =0; i<n; i++){
            for (int j =0; j<n; j++){
            	if(i==j || i+j == n-1){
            		System.out.print("*");   
            	}else {
                	System.out.print(" ");
            	}
            }
            System.out.println();
		}
		System.out.println();
		
		for (int i =0; i<m; i++){
            for (int j =0; j<m; j++){
            	if(i==j || i+j == m-1){
            		System.out.print("*");   
            	}else {
                	System.out.print(" ");
            	}
            }
            System.out.println();
		}
		
	}
	
}