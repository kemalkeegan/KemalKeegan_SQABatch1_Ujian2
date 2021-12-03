package com.sqa.no7;

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
	public void cekSaldo() {
		System.out.println("Saldo anda saat ini adalah " + this.Saldo);
	}
	public void setor(int setor) {
		this.Saldo = this.Saldo + setor;
		System.out.println("Setoran sebesar " + setor +" berhasil dilakukan, saldo anda sekarang " + this.Saldo);
	}
	public void tarik(int tarik) {
		if(this.Saldo < tarik) {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		}else {
			this.Saldo = this.Saldo - tarik;
			System.out.println("Penarikan sebesar " + tarik + " berhasil dilakukan, saldo anda sekarang " + this.Saldo);
		}
	}	
}
