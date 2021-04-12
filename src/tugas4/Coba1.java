package tugas4;

import java.util.Scanner;

public class Coba1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner masuk = new Scanner(System.in);
		byte urutan=0;
		int sks[] = new int[10];
		int totalSKS = 0;
		
		String mataKuliah[] = new String[10];
		byte pilihanJenjang;
		
		System.out.println("Masukkan Pilihan Jenjang : \n1. D3 \n2. S1" );
		pilihanJenjang = input.nextByte();
		
		if(pilihanJenjang ==1) {
			while(urutan<4) {
				System.out.println("Mata Kuliah ke : " +(urutan+1) + "=");
				mataKuliah[urutan] = masuk.nextLine();
				System.out.println("SKS Mata Kuliah" + (urutan+1) + "=" );
				sks[urutan]=input.nextInt();
				totalSKS+=sks[urutan];	
				urutan++;
			}
		}
		
		else if (pilihanJenjang==2) {
			while(urutan<6) {
				System.out.println("Mata Kuliah ke : " +(urutan+1) + "=");
				mataKuliah[urutan] = masuk.nextLine();
				System.out.println("SKS Mata Kuliah" + (urutan+1) + "=" );
				sks[urutan]=input.nextInt();
				totalSKS+=sks[urutan];
				urutan++;
			}
		}
		else {
			System.out.println("Tidak Sesuai Pilihan");
		}
		System.out.println("Total SKS adalah" +totalSKS);
		
		
	}

}
