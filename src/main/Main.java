package main;

import inheritance.Person;
import inheritance.Person2;
import inheritance.Student;

public class Main {
	public static void main(String[] args) {
//		Person person = new Person();
		Person2 person = new Person2("Yona", "Astika");
//		person.setFname("Yona");
//		person.setLname("Astika");
		System.out.println(person.getFullname());
		
		Student student = new Student("Yona", "Astika");
		student.hitungSks("Matematika dasar");
		student.hitungSks("Matematika dasar1");
		student.hitungSks("Matematika dasar2");
		student.hitungSks("Matematika dasar2");
		System.out.println(student.getFullname());
		student.getStudentData();
		
		
		
	
	}

}
