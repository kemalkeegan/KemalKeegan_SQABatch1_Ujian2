package com.sqa.no9;

import java.util.Scanner;

public class No9 {
	public static void main(String[] args) {
		int[] angka = {0,2,4,6,8,10};
		Scanner in = new Scanner(System.in);
		No9 jumlah= new No9();
		System.out.println("Jumlah Angka: " + jumlah.jumlahArray(angka));	
		System.out.println("Masukkan Angka = ");
		int nilai = in.nextInt();
		if(jumlah.cariNilai(angka, nilai)) {
			System.out.println("Angka ditemukan");
		}else
		{
			System.out.println("Angka tidak ditemukan");
		}
	}
	
	public int jumlahArray(int[] nilai) {
		 int sum = 0;
		 for (int i = 0; i<nilai.length; i++) {
		  sum += nilai[i];
		 }
		 return sum;
		}
	public boolean cariNilai(int[] arr, int nilai) {
		 for (int x = 0; x<arr.length; x++) {
		  if (arr[x] == nilai)
		   return true;
		 }
		 return false;
		}

}
