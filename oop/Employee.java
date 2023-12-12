package oop;

import java.util.Date;

public class Employee extends User {
	
	private int salary;
	private Date vacationDate;
	private int experience;
	
	public Employee() {
		
	}
	public Employee(String name, String surname, int id, String password, String email,int salary, Date vacationDate, int experience) {
		super(name,surname,id,password,email);
		this.salary = salary;
		this.vacationDate = vacationDate;
		this.experience = experience;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getVacationDate() {
		return vacationDate;
	}
	public void setVacationDate(Date vacationDate) {
		this.vacationDate = vacationDate;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void goingToVacation() {}
	
	public void getHiredOrFired() {}
	
	public String sendMessage() {
		return ;
	}
	
	public String sendRequest() {
		return ;
	}
	
	public String toString() {
		return super.toString() + " "+ salary + " " + vacationDate + " " + experience;
	}
	

}
