package tugas2;
import java.util.Scanner;

public class Lingkaran{
	private double luasling, r, kelling,
    phi = 3.14;
	public void Lingkaran(){      
        
        
        Scanner b = new Scanner(System.in);
        
        System.out.println("LINGKARAN");
        System.out.println("  ");
        System.out.println("Masukkan jari-jari : ");
        
        r = b.nextDouble();
        luasling = phi*r*r;
        kelling = 2*phi*r;
        
        System.out.println("Luas Lingkaran		: "+luasling);
        System.out.println("Keliling Lingkaran 	: "+kelling);
   }
	
}
