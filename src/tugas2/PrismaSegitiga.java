package tugas2;

import java.util.Scanner;

public class PrismaSegitiga extends Segitiga {
	
	@Override
	public void Segitiga() {
		// TODO Auto-generated method stub
		super.Segitiga();
		System.out.println("Masukkan tinggi trisma	 : ");
		Scanner inp = new Scanner(System.in);
		double tinggi = inp.nextDouble();
		double volume = luas * tinggi;
		
		System.out.println("Volume PrismaSegitiga    : "+volume);
	}

}
