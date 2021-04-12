package tugas1;
import java.util.Scanner;
import java.time.LocalDate;

public class MainApp {
	
//	private static Person p = new Person();//ini diluar supaya bisa diakses ke luar
	private static Person p = new Person("Yona", "Astika", "Semarang", 1998 , new Pendidikan());
	
	public static void main(String[] args) {
		
		System.out.println("Masukkan nama anda : ");
		Scanner input = new Scanner(System.in);
		String nama = input.next();
		System.out.println("Selamat datang " + nama);
		
		 
		
//		p.fname = "Yona"; 
//		p.lname = "Astika";
//		p.domisili = "Semarang";
		p.pendidikan.sd = "SD PL Don Bosko";
		p.pendidikan.smp = "SMP Maria Mediatrix";
		p.pendidikan.sma = "SMA N 4 Semarang";
		p.pendidikan.perguruanTinggi = "Politeknik Negeri Semarang";
		
		LocalDate birthdate =  LocalDate.of(1998, 7, 15);
		LocalDate now = LocalDate.now();
		int age = now.minusYears(birthdate.getYear()).getYear();
		p.setUsia(age);
		
		
//		p.setTahunLahir(1998);
		getMenuUtama();	
	}
	
	//method
	private static void getMenuUtama() {
		System.out.println("\nPilihan : \n 1. Person\n 2. Pendidikan\n");
		System.out.println("Masukkan Pilihanmu? :");
		
		Scanner input = new Scanner(System.in);
		int pilih;
		pilih = input.nextInt();
		getPilihMenu(pilih);
	}
	
	private static void getPilihMenu(int pilih) {
		System.out.println("");
		System.out.println("-------------------");
		switch(pilih) {
		
		case 1 :
			System.out.println("Fullname : " + p.fullname());
			System.out.println("Domisili : "  + p.domisili);
			System.out.println("Usia : " + p.getUsia());
			getMenuUtama();	
		break;
		
		case 2:
			System.out.println("Pendidikan :" + p.pendidikan.sd);
			System.out.println("Pendidikan :" + p.pendidikan.smp);
			System.out.println("Pendidikan :" + p.pendidikan.sma);
			System.out.println("Pendidikan :" + p.pendidikan.perguruanTinggi);
			getMenuUtama();
		break;
		default :
		System.out.println("Menu tidak tersedia!");
		getMenuUtama();
		
			
		}				
	}

}
