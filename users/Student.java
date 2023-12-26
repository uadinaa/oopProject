package users;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import enums.StudentOrganizations;
import enums.StudentStatus;
import example1.Course;
import example1.Mark;

public class Student extends User implements Serializable{
	private int yearOfStudy;
	private double gpa;
	private StudentOrganizations organization;
	private StudentStatus stud_status;
	private HashMap<Course,Mark> transcript =new HashMap<>();
	
	public Student() {}
	
	public Student(String name,String surname,int yearOfStudy,double gpa,HashMap<Course,Mark> transcript,StudentOrganizations organization, StudentStatus stud_status) {
		super(name,surname);
		this.yearOfStudy=yearOfStudy;
		this.gpa=gpa;
		this.organization=organization;
		this.stud_status=stud_status;
		this.transcript = new HashMap<>();
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public StudentOrganizations getOrganization() {
		return organization;
	}
	public void setOrganization(StudentOrganizations organization) {
		this.organization = organization;
	}
	public StudentStatus getStud_status() {
		return stud_status;
	}
	public void setStud_status(StudentStatus stud_status) {
		this.stud_status = stud_status;
	}
	
	public void setTranscript(Course course, Mark mark) {
		transcript.put(course, mark);
	}
	
	public HashMap<Course, Mark> getTranscript() {
		return transcript;
	}

	
	public String toString() {
		return "Student " +super.toString() +", yearOfStudy=" + yearOfStudy + ", " +"gpa=" + gpa + ", organization="
				+ organization + ", stud_status=" + stud_status + ", gradeList=" + transcript + "]";
	}
	
	
	
	
	
	

}
