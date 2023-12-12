package oop;

import java.util.Date;

public class Student extends User{
	private int yearOfStudy;
	private Schools school;
	private double gpa;
	private Mark marks;
	private DiplomaProject diplomWork;
	private HashMap<Course,Mark> gradeList;
	private StudentOrganizations organization;
	private int stipend;
	private StudentStatus studentStatus;
	
	public Student() {
		
	}
	
	public Student(String name, String surname, int id, String password, String email,int yearOfStudy,  Schools school, double gpa,Mark marks, DiplomaProject diplomWork, HashMap<Course,Mark> gradeList, StudentOrganizations organization, int stipend, StudentStatus studentStatus ) {
		super(name,surname,id,password,email);
		this.yearOfStudy = yearOfStudy;
		this.school = school;
		this.gpa = gpa;
		this.marks = marks;
		this.diplomWork = diplomWork;
		this.organization = organization;
		this.stipend = stipend;
		this.studentStatus = studentStatus;
	}
	
	public void viewMarks() {
		
	}
	
	public void viewTranscript() {
		
	}
	
	public void registerToCourse() {
		
	}
	
	public void studOrgMembership() {
		
	}
	
	public void infoAboutTeachers(){
		
	}
	
	public void getStipendia() {
		
	}
	
	public double getGpa() {
		return 3.95;
	}
	
	public String toString() {
		return super.toString() + " " + yearOfStudy + " " + school + " " + gpa + " " + marks + " "+ diplomWork + " " +  organization+ " " + stipend+ " " +  studentStatus;
	}
	/*

viewTranscript(DATABASE singleton<?>)
registerToCourse(Course)
studOrgMembership(StudentOrganizations)
infoAboutTeachers(Teacher)
getStipendia()
getGpa(): double
	 */

}
