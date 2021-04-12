package tugas5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		getMenuUtama();
	}
	
	//supaya ga pake static gimana?
	public static void getMenuUtama() {
		int pil; 
		Scanner inp = new Scanner(System.in);
		System.out.println("===============MENU===============");
		System.out.println("1. Menu Paket");
		System.out.println("2. Menu Makanan");
		System.out.println("3. Menu Minuman");
		System.out.println("==================================");
		System.out.println("Masukkan Pilihan : ");
		
		pil = inp.nextInt();
		getPilihMenu(pil);
		
	}
	public static void getPilihMenu(int pil) {
		switch(pil) {
		case 1 :
			//supaya nampilinnya array gimana?
			System.out.println("=====DAFTAR MENU PAKET=====");
			System.out.println("1. Paket A -- Nasi Ayam + Es Teh ");
			System.out.println("2. Paket B -- Nasi Goreng + Es Teh ");
			getMenuUtama();
			break;
		case 2 :
			System.out.println("=====DAFTAR MENU MAKANAN=====");
			System.out.println("1. Nasi Putih");
			System.out.println("2. Nasi Goreng");
			System.out.println("3. Ayam Goreng");
			getMenuUtama();
			break;
		case 3 :
			System.out.println("=====DAFTAR MENU MINUMAN=====");
			System.out.println("1. Es Teh");
			System.out.println("2. Jeruk Hangat");
			System.out.println("3. Kopi");
			getMenuUtama();
			break;
		}
	}


}
