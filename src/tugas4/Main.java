package tugas4;

import java.util.Scanner;
import java.util.Set;

public class Main extends AbstractPerson {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.getMenuUtama();
	}
	
	void getMenuUtama() {
		System.out.println("Pilih Menu : \n1. Registrasi \n2. Planing \n3. Cetak Hasil");
		//cetak hasil utk review hasil registrasi dan pengisian planning
		
		Scanner inp = new Scanner(System.in);
		int pil = inp.nextInt();
		if(pil==1) {
			System.out.println("Masukkan Nama : ");
			inp = new Scanner(System.in);
			String nama = inp.next();
			
			System.out.println("Masukkan NIM : ");
			inp = new Scanner(System.in);
			String nim = inp.next();
			
			System.out.println("Domisili :");
			inp = new Scanner(System.in);
			String domisili =inp.next();
			
			planStudentRegistration(nama, nim);
			person.setDomisili(domisili);
			getMenuUtama();
		}
		else if (pil==2) {
			System.out.println("Masukkan Course Name : ");
			inp = new Scanner(System.in);
			String courseName = inp.next();
			
			System.out.println("Masukkan Room : ");
			inp = new Scanner(System.in);
			String room = inp.next();
			
			System.out.println("Masukkan SKS :");
			inp = new Scanner(System.in);
			int sks =inp.nextInt();
			
			publicLearning(courseName, room, sks);
			getMenuUtama();
		}
		else if(pil==3) {
			int jmlsks = 0;//ini nilai defaultnya
			
			for (Course course : list) {
				jmlsks += course.getSks();
			}
			if(jmlsks>=144) {
				person.setTitle("S. T");
			} else {
				person.setTitle("");
			}
			System.out.println("Nama Lengkap : " + person.getFullName() + " " + person.getTitle());
			System.out.println("NIM : " + person.getCardIdentitas());
			for (Course course : list) {
				System.out.println(course.getCourseName()+ " " + course.sks);
			}
			getMenuUtama();
			
		}
	}

}
