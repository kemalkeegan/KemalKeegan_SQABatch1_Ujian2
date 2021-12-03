package com.sqa.no1;

import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);
	

	}

	static void cetakFibonacci(int batas) {
		long a = 1;
		long b = 1;
		int angka = 0;

		while (angka < batas) {
			if (angka < batas) {
				System.out.print(a + " ");
				a = a + b;
				angka++;
			}
			if (angka < batas) {
				System.out.print(b + " ");
				b = b + a;
				angka++;
			}
		}
	}

}
