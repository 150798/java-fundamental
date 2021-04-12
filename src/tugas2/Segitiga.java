package tugas2;
import java.util.Scanner;

public class Segitiga{
	private double luas,alas,tinggi,s,kel;
	
	public void Segitiga(){
		
        
        Scanner a = new Scanner(System.in);
        System.out.println("SEGITIGA");
        System.out.println(" ");
        System.out.println("Masukkan alas : ");
        
        alas = a.nextDouble();
        System.out.println("Masukkan tinggi :");
        tinggi = a.nextDouble();
        
        System.out.println("Masukkan sisi : ");
        s = a.nextDouble();
        
        luas = (alas*tinggi)/2;
        kel = (s*2)+alas;
        
        System.out.println("Luas Segitiga		 : "+luas);
        System.out.println("Keliling Segitiga    : "+kel);
    }

}
