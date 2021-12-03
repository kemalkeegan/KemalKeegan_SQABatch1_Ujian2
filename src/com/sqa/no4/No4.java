package com.sqa.no4;

import java.util.Scanner;

public class No4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan sisa BBM dalam tangki (liter) = ");
		double sisa = in.nextInt();
		System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		double jarakPerLiter = in.nextInt();
		
		System.out.println("Kendaraan anda dapat menempuh jarak "+ hitungSisaJarak(sisa, jarakPerLiter)+ " kilometer dengan sisa BBM yang ada di tangki");
	}
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
		}


}
