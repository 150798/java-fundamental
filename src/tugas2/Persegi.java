package tugas2;
import java.util.Scanner;

public class Persegi {
	
	protected double sisi;
	private double luasp;
	private double kelp;
	public void Persegi(){
        
        
        Scanner c = new Scanner(System.in);
        System.out.println("Persegi");
        System.out.println("    ");
        System.out.println("Masukkan sisi : ");
        sisi = c.nextDouble();      
        luasp = sisi*sisi;
        kelp = 4*sisi;
        
        System.out.println("Luas Persegi		 : "+luasp);
        System.out.println("Keliling Persegi	 : "+kelp);
    }   

}
