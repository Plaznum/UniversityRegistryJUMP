package com.cognixia.jump.corejava.universityregistry;

import com.cognixia.jump.corejava.universityregistry.Student.Classifications;
import com.cognixia.jump.corejava.universityregistry.Student.Residency;
import com.cognixia.jump.corejava.universityregistry.UniversityCourse.Locations;

public class StudentRunner {

	public static void main(String[] args) {

		UniversityCourse psych101 = new UniversityCourse("Psych-101", "Psychology", "Charles Dunn", Locations.ONLINE, "12:00pm EST", true);
		
		
		//psych101.setClassSize(28);
		System.out.println(psych101.getClassSize());
		
		psych101.addStudent(new Student("Foo", "Bar", 3.75, "Computer Science", "Robot Psychology", Classifications.FRESHMAN, Residency.ONCAMPUS, 0));
		psych101.addStudent(new Student("Charles" , "Dunn", 4.5, "Computer Science", "Robot Psychology", Classifications.GRADUATE, Residency.ONCAMPUS, 0));
		
		System.out.println(psych101.getClassSize());
		
		psych101.listStudents();
		
		Student[] arr1 = psych101.getStudents();
		System.out.println(arr1[0]);
		
		psych101.removeStudent(1);

		
		//psych101.listStudents();
		
		Student[] arr2 = psych101.getStudents();
		System.out.println(arr2[0]);
		
	}

}
