package com.cognixia.jump.corejava.universityregistry;

public class UniversityCourse {

	//Class Variables
	
	private static int idCounter = 1;
	enum Locations {
		ONLINE, ONCAMPUS
	}
	
	//Attributes
	private int sectionID;
	private int classSize;
	private String subject;
	private boolean isFull;
	private String dept;
	private String professor;
	private Locations location; 
	private String time;
	private boolean waitlistAuth;
	
	private Student[] students;

	
	

	//Constructors
	public UniversityCourse() {
		super();
		this.sectionID = idCounter++;
		this.students = new Student[30];
	}
	
	public UniversityCourse(String subject, String dept, String professor,
			Locations location, String time, boolean waitlistAuth) {
		super();
		this.sectionID = idCounter++;
		this.classSize = 0;
		this.subject = subject;
		this.isFull = false;
		this.dept = dept;
		this.professor = professor;
		this.location = location;
		this.time = time;
		this.waitlistAuth = waitlistAuth;
		
		this.students = new Student[30];
	}
	
	
	//ClassMethods
	public void addStudent(Student student) {
		this.checkFull();
		if (this.isFull) {
			if(this.waitlistAuth) {
				System.out.println("Class is full but Prof. " + this.professor + "has authorized a waitlist.");
			}
			else {
				System.out.println("Classlist is full and there is no waitlist available.");
			}
		}
		//Not Full
		else {
			this.students[this.classSize] = student;
			System.out.println(student.getFirstName() + " has been added!");
			this.classSize++;
			
			
		}
	}
	
	public void removeStudent(int studentID) {
		int found = studentIndexFromID(studentID);
		String name = students[found].getFirstName() + " " + students[found].getLastName();
		if(found == -1) {
			System.out.println("student not found");
		}
		else {
			for( int i = found; i < classSize; i++) {
				students[i] = students[i+1];
				
			}
			classSize--;
			System.out.println("Sucessfully deleted student: " + name);
		}
	}
	
	public int studentIndexFromID(int studentID) {
		for (int i = 0; i < classSize; i++) {
			if(studentID == students[i].getStudentID()) {
				return i;
			}
				
		}
		return -1;
	}
	
	public void listStudents() {
		if (classSize == 0) {
			System.out.println("There are no students in this course.");
		}
		else {
			for (int i = 0; i < classSize; i++) {
				System.out.println(students[i].toString());
			}
		}
	}
	
	public void checkFull() {
		if(this.classSize == this.students.length) {
			this.setFull(true);
		}
	}
	
	
	//Get Set
	
	public int getClassSize() {
		return classSize;
	}

	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean isWaitlistAuth() {
		return waitlistAuth;
	}

	public void setWaitlistAuth(boolean waitlistAuth) {
		this.waitlistAuth = waitlistAuth;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getSectionID() {
		return sectionID;
	}
	
	

	
	//Overrides
	
}
