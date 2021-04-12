package tugas5;

import java.util.Scanner;

public class Cobacoba {
	public static void main(String[] args) {
		Coba1 menu = new Coba1();
		menu.menuUtama();
		
	}
	
	void listMenuMakanan(int jenis) {
		if(jenis==1) {
			System.out.println("1. Nasi Goreng				[Rp. 10.000]");
			System.out.println("2. Ayam Goreng				[Rp. 15.000]");
			System.out.println("3. Tempe Goreng				[Rp.  5.000]");	
		} else if(jenis==2) {
			//MINUMAN
			System.out.println("4. Es Teh				[Rp.  5.000]");
			System.out.println("5. Es Jeruk				[Rp.  6.000]");
			System.out.println("6. Kopi					[Rp. 10.000]");
			
		}else {
			//PAKET MAKANAN
			System.out.println("7. Paket A(Nasi Goreng + Es Teh)	[Rp. 13.000]");
			System.out.println("8. Paket B(Ayam Goreng + Es Teh)	[Rp. 18.000]");
		}
		
		System.out.println("Silahkan pilih menu : ");
		Scanner inp = new Scanner(System.in);
		int pil = inp.nextInt();
		System.out.println("Masukkan jumlah : ");
		inp =new Scanner(System.in);
		int jml = inp.nextInt();
		this.pil = pil;
		hitungTotal(jml);
		this.listPesanan.add(new Struck(menuDipilih, jml, harga));
		menuUtama();
		
	}
	void menuUtama() {
		System.out.println("==============================");
		System.out.println("=============MENU============");
		System.out.println("1. Menu Makanan");
		System.out.println("2. Menu Minuman");
		System.out.println("3. Menu Paket");
		System.out.println("4. Selesai dan hitung Pembayaran");
		System.out.println("0. Keluar Program");
		
		System.out.println("Masukkan Pilihan Anda disini: ");
		Scanner inp = new Scanner (System.in);
		int pil = inp.nextInt();
		
		if(pil==0) {
			System.exit(0);
			
		}else if(pil==4) {
			System.out.println("Total :" +total);
			System.out.println("Bayar : ");
			Scanner input = new Scanner(System.in);
			this.bayar = input.nextDouble();
			this.hitungKembalian(this.bayar);
			receiptPembayaran(listPesanan, this.total, this.bayar);
			
		}else {
			this.listMenuMakanan(pil);
		}
		
	}

}
