package tugas5;

import java.util.Scanner;

//biaya total
//menampilkan biaya tootal
//menghitung kembalian
//menampilkan kembalian
//input ouutput program

public class Coba1 {
	double harga, total, bayar, kembalian;
	int pil, jumlah;
	
	double hitungTotal(int jml) {
		jumlah = jml;
		switch(pil) {
		case 0 :
			System.exit(0);
			break;
		case 1 :
			harga = 10000;
			total = total+(harga*jml +(harga*0.1));
		case 2 :
			harga = 15000;
			total = total+(harga*jml +(harga*0.1));
			break;
		case 3 :
			harga = 5000;
			total = total+(harga*jml +(harga*0.1));
			break;
		case 4 :
			harga = 5000;
			total = total+(harga*jml +(harga*0.1));
			break;
		case 5 :
			harga = 6000;
			total = total+(harga*jml +(harga*0.1));
			break;
		case 6 :
			harga = 10000;
			total = total+(harga*jml +(harga*0.1));
			break;
		case 7 :
			harga = 13000;
			total = total+(harga*jml +(harga*0.1));
			break;
		case 8 :
			harga = 18000;
			total = total+(harga*jml +(harga*0.1));
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
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Coba1 in = new Coba1();
		
		do {
			System.out.println("==============================");
			System.out.println("=============MENU============");
			
			//MAKANAN
			System.out.println("1. Nasi Goreng				[Rp. 10.000]");
			System.out.println("2. Ayam Goreng				[Rp. 15.000]");
			System.out.println("3. Tempe Goreng				[Rp.  5.000]");
			
			//MINUMAN
			System.out.println("4. Es Teh				[Rp.  5.000]");
			System.out.println("5. Es Jeruk				[Rp.  6.000]");
			System.out.println("6. Kopi					[Rp. 10.000]");
			
			//PAKET MAKANAN
			System.out.println("7. Paket A(Nasi Goreng + Es Teh)	[Rp. 13.000]");
			System.out.println("8. Paket B(Ayam Goreng + Es Teh)	[Rp. 18.000]");
			
			System.out.println("=============================");
			System.out.println("9. Selesai dan hitung Pembayaran");
			System.out.println("0. Keluar Program");
			
			System.out.println("Masukkan Pilihan Anda disini: ");
			in.pil = input.nextInt();
			if (in.pil>=1 && in.pil<=6) {
				System.out.println("masukkan jumlah beli : ");
				in.jumlah = input.nextInt();
			} else {
				
			}
			in.hitungTotal(in.jumlah);
			
		} while(in.pil!=9);
		in.viewTotal();
		System.out.println("Bayar : ");
		in.bayar = input.nextDouble();
		in.hitungKembalian(in.bayar);
		in.viewKembalian();
			
		
	}

}
