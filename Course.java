package oop;

import java.util.Vector;

public class Course {
	private String name;
	private int credits;
	private Schools school;
	private Vector<Teacher> teacher;
	private TypeLesson typeLesson;
	
	public Course() {}
	
	public Course(String name, int credits, Schools school) {
		this.name = name;
		this.credits = credits;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Schools getSchool() {
		return school;
	}

	public Vector<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(Vector<Teacher> teacher) {
		this.teacher = teacher;
	}

	public TypeLesson getTypeLesson() {
		return typeLesson;
	}

	

}
