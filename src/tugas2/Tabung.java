package tugas2;

import java.util.Scanner;

public class Tabung extends Lingkaran {
	@Override
	public void Lingkaran() {
		// TODO Auto-generated method stub
		super.Lingkaran();
		
		System.out.println("Masukkan tinggi tabung : ");
		Scanner inp = new Scanner(System.in);
		double tinggi = inp.nextDouble();
		double volume = luasling * tinggi;
		System.out.println("Volume  	 :" +volume );
		
	}
	

}
