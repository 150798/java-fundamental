package tugas4;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractPerson {
	public List<Course> list = new LinkedList<>();
	
	Person person;
	
	void planStudentRegistration(String fullName, String cardIdentitas) {
		person=new Person(fullName, cardIdentitas);
	}
	void publicLearning (String courseName, String room, int sks) {
		list.add(new Course(courseName, room, sks, person));
		
	}

}
