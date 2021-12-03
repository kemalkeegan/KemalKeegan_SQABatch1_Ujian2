package com.sqa.no8;

public class Tabungan {
	String nama;
	int NomorRekening;
	int Setoran;
	int Saldo;
	public Tabungan(String nama, int NomorRekening, int Setoran) {
		this.nama = nama;
		this.NomorRekening = NomorRekening;
		this.Setoran = Setoran;
		this.Saldo = Setoran;
	}
	
	public String toString() {
        return "Tabungan nomor " + this.NomorRekening + " atas nama " + this.nama + " dengan saldo sebesar " + this.Saldo ;
    }
}
