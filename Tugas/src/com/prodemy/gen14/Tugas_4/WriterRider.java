package com.prodemy.gen14.Tugas_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriterRider {

	public static void main(String[] args) {
		Barang barang1 = new Barang ("Oreo", 5000, 10);
		Barang barang2 = new Barang ("Ultra", 6000, 11);
		Barang barang3 = new Barang ("Pocky", 8000, 30);
		Barang barang4 = new Barang ("Silverqueen", 15000, 20);
		
		try {
			FileOutputStream f = new FileOutputStream(new File("DaftarBarang.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(barang1);
			o.writeObject(barang2);
			o.writeObject(barang3);
			o.writeObject(barang4);
			
			o.close();
			f.close();
			
			FileInputStream fi = new FileInputStream(new File("DaftarBarang.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Barang b1 = (Barang) oi.readObject();
			Barang b2 = (Barang) oi.readObject();
			Barang b3 = (Barang) oi.readObject();
			Barang b4 = (Barang) oi.readObject();
			
			System.out.println(b1.toString());
			System.out.println(b2.toString());
			System.out.println(b3.toString());
			System.out.println(b4.toString());
			
			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch(IOException e) {
			System.out.println("Error Initializing Stream");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
