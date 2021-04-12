package tugas2;

import java.util.Scanner;

public class BangunDatar {
	
	 private static Lingkaran l = new Lingkaran();
	 private static Segitiga s = new Segitiga();
	 private static Persegi p = new Persegi();
	 private static Kubus k = new Kubus();
	 private static Tabung t = new Tabung();
	 private static PrismaSegitiga pr = new PrismaSegitiga();
	
	public static void main(String[] args) {
		getMenuUtama();
		
	}
	
	private static void getMenuUtama() {
		int pil;
        Scanner inp = new Scanner(System.in);
        System.out.println("--------MENU--------");           
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");      
        System.out.println("3. Persegi"); 
        System.out.println("4. Kubus"); 
        System.out.println("5. Tabung"); 
        System.out.println("6. Prisma Segitiga"); 
        System.out.println("-------------------"); 
        System.out.print("Masukkan Pilihan : ");
        
        pil = inp.nextInt();
        getPilihMenu(pil);
	}
	
	private static void getPilihMenu(int pil) {
		switch(pil){
        case 1 : l.Lingkaran();
        getMenuUtama();
        break;
        case 2 : s.Segitiga();
        getMenuUtama();
        break;
        case 3 : p.Persegi();
        getMenuUtama();
        break; 
        case 4 : k.Persegi();
        getMenuUtama();
        break; 
        case 5 : t.Lingkaran();
        getMenuUtama();
        break; 
        case 6 : pr.Segitiga();
        getMenuUtama();
        break; 
      
         }
	}
}
