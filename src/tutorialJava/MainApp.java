package tutorialJava;

import modifier.Person;
import modifier.Segitiga;

public class MainApp {
	public static void main(String[] args) {
		Segitiga s = new Segitiga(); //disebut constructor
		s.alas = 10;
		s.tinggi = 5;
		s.drawSegitiga();
		System.out.println("Luasnya adalah : " + s.hitungLuas());
		
		Segitiga s1= new Segitiga(20, 10);
		System.out.println("Luas kedua adalah : " + s1.hitungLuas());
		
		Person p = new Person();
		p.fname = "Yona";
		p.lname = "Astika";
		p.alamat.jalan = "Jalan Jatiluhur";
		p.alamat.kecamatan = "Banyumanik";
		p.alamat.provinsi = "Jawa Tengah";
		p.setTahunLahir(1998);
		System.out.println("Fullname : " + p.fullName());
		System.out.println("Tahun lahir " + p.getTahunLahir());
		
		
		
		
//		HelloWorld obj1 = new HelloWorld();
//		obj1.name = "Yona" ;
//		//obj1.setusia(-10);
//		System.out.println(obj1.getName());
////		System.out.println(obj1.getUsia());
		
	}
}
