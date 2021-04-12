package tugas4;

import java.util.HashMap;
import java.util.Map;

public class Course {
	String courseName, room;
	int sks;
	Person person;
	
	public Course(String courseName, String room, int sks, Person person) {
		super();
		this.courseName = courseName;
		this.room = room;
		this.sks = sks;
		this.person = person;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getSks() {
		return sks;
	}
	public void setSks(int sks) {
		this.sks = sks;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	
	}
	
	

