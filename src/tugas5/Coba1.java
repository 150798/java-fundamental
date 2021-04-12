package tugas5;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//biaya total
//menampilkan biaya tootal
//menghitung kembalian
//menampilkan kembalian
//input ouutput program

public class Coba1 extends OrderList{
	double harga, total, bayar, kembalian;
	int pil, jumlah;
	String menuDipilih;
	
	//implementasi collections
	List<Struck> listPesanan = new LinkedList<Struck>();
	
	
	double hitungTotal(int jml) {
		jumlah = jml;
		switch(pil) {
		case 0 :
			System.exit(0);
			break;
		case 1 :
			harga = 10000;
			total = total+(harga*jml +(harga*0.1));
			menuDipilih="Nasi Goreng";
			break;
		case 2 :
			harga = 15000;
			total = total+(harga*jml +(harga*0.1));
			menuDipilih="Ayam Goreng";
			break;
		case 3 :
			harga = 5000;
			total = total+(harga*jml +(harga*0.1));
			menuDipilih="Tempe Goreng";
			break;
		case 4 :
			harga = 5000;
			total = total+(harga*jml +(harga*0.1));
			menuDipilih="Es Teh";
			break;
		case 5 :
			harga = 6000;
			total = total+(harga*jml +(harga*0.1));
			menuDipilih="Es Jeruk";
			break;
		case 6 :
			harga = 10000;
			total = total+(harga*jml +(harga*0.1));
			menuDipilih="Kopi";
			break;
		case 7 :
			harga = 13000;
			total = total+(harga*jml +(harga*0.1));
			menuDipilih="Paket A";
			break;
		case 8 :
			harga = 18000;
			total = total+(harga*jml +(harga*0.1));
			menuDipilih="Paket B";
			break;
		case 9:
			break;
		default :
			System.out.println("Input yang anda masukkan salah");
			break;
		}
		return total;
	}
	
	void viewTotal() {
		System.out.println("==========Pembayaran==========");
		System.out.println("Total : Rp. " + total);
	}
	
	double hitungKembalian(double byr) {
		bayar = byr;
		kembalian = byr-total;
		return kembalian;
	}
	
	void viewKembalian() {
		System.out.println("Kembalian : Rp. " +kembalian);
		System.out.println("----TERIMAKASIH---");
		
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
	
	public static void main(String[] args) {
		Coba1 menu = new Coba1();
		menu.menuUtama();
		
	}

}
