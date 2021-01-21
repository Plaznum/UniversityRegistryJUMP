package com.cognixia.jump.corejava.universityregistry;

import java.text.DecimalFormat;

public class Student {
	
	//Class Variables (static, enums)
	enum Classifications {
		FRESHMAN, SOPHOMORE, JUNIOR, SENIOR, GRADUATE, NONDEGREE
	}
	
	enum Residency {
		ONCAMPUS, OFFCAMPUS, COMMUTER
	}
	private static int idCounter = 1;
	
	private static DecimalFormat dFormat = new DecimalFormat("#.##");
	
	
	//Attributes
	private int studentID;
	private String firstName;
	private String lastName;
	private double gpa;
	private String major;
	private String minor;
	private Classifications classifications;
	private Residency residency;
	private int hoursEarned;
	
	//Constructors
	
	public Student() {
		super();
		this.studentID = idCounter++;
	}
	
	public Student(Classifications classifications) {
		super();
		this.studentID = idCounter++;
		this.classifications = classifications;
	}
	
	public Student(String firstName, String lastName, double gpa, String major, String minor,
			Classifications classifications, Residency residency, int hoursEarned) {
		super();
		this.studentID = idCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.major = major;
		this.minor = minor;
		this.classifications = classifications;
		this.residency = residency;
		this.hoursEarned = hoursEarned;
		
		setGpa(gpa);
	}
	
	//Class Methods
	
	
	
	//Getters, Setters
	public int getStudentID() {
		return studentID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getGpa() {
		return Double.parseDouble(dFormat.format(gpa));
	}
	public void setGpa(double gpa) {
		
		if(gpa > 4) {
			this.gpa = 4.00;
		}
		else if(gpa < 0) {
			this.gpa = 0.00;
		}
		else {
		this.gpa = gpa;
		}
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	public Classifications getClassifications() {
		return classifications;
	}
	public void setClassifications(Classifications classifications) {
		this.classifications = classifications;
	}
	public Residency getResidency() {
		return residency;
	}
	public void setResidency(Residency residency) {
		this.residency = residency;
	}
	public int getHoursEarned() {
		return hoursEarned;
	}
	public void setHoursEarned(int hoursEarned) {
		this.hoursEarned = hoursEarned;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + ", gpa="
				+ gpa + ", major=" + major + ", minor=" + minor + ", classifications=" + classifications
				+ ", residency=" + residency + ", hoursEarned=" + hoursEarned + "]";
	}
	
	
	

	
	
}
