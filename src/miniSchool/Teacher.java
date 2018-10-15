package miniSchool;

import java.util.ArrayList;

public class Teacher extends Person {

	ArrayList<Student> watchS = new ArrayList<Student>();
	
	public void addStudent(Student s1) {
		
		watchS.add(s1);
		
	}
	
}
