package com.sqa.no3;

import java.util.Scanner;

public class No3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan jarak (kilometer) = ");
		double jarak = in.nextInt();
		System.out.println("Masukkan waktu (jam) = ");
		double waktu = in.nextInt();
		
		System.out.println("Kecepatan rata-rata anda adalah "+ hitungkecepatan(jarak, waktu)+ " km/jam");
		
	}
	static double hitungkecepatan(double j, double w) {
		double k;
		k = j / w;
		return k;
	}
	
}
