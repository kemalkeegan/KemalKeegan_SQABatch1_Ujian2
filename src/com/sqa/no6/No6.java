package com.sqa.no6;

import java.text.BreakIterator;
import java.util.Scanner;

	class BebasException extends Exception {
		public BebasException(String s) {
			super(s);
	}
}
		public class No6 {
	
			public static void main(String[] args) {
			//Ujian, gunakan inputan
			//jenis kelamin, status
			//pria blm menikah, pajak 10%
			//pria menikah, pajak 5%
			//wanita blm menikah, pajak 7%
			//wanita menikah, pajak 3%
			//validasi: jika diinputkan selain 2 jenis kelamin tersebut gunakan throw
			//validasi: jika diinputkan selain 2 status tersebut gunakan catch
				Scanner in = new Scanner(System.in);
				System.out.println("Masukkan Gender 1=Pria || 2=Wanita : ");
				String gender = in.nextLine();
				System.out.println("Masukkan Status Menikah 1=Menikah || 2=Belum menikah : ");
				String menikah = in.nextLine();
			
			
			try{				
				
				if(gender.equalsIgnoreCase(menikah)) {
					throw new BebasException("pria menikah, pajak 5%");
				} else {
					System.out.println("pria blm menikah, pajak 10%");
				} 	
			} catch (BebasException e) {
				e.printStackTrace();
			} 
			
			try {				

				if(gender.equalsIgnoreCase(menikah)) {
					throw new BebasException("wanita menikah, pajak 3%%");
				} else {
					System.out.println("wanita blm menikah, pajak 7%");
				} 	
			} catch (BebasException e) {
				e.printStackTrace();
			}
		}
	}





