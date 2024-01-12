package oop;

import java.util.Date;


public class Employee extends User {
	private double salary;
	static Date vacationDate;
	private int experience;
	
	public Employee() {}

	public Employee(String name, String surname,double salary,Date vacationDate,int experience) {
		super(name,surname);
		this.setSalary(salary);
		this.setVacationDate(vacationDate);
		this.experience=experience;
	}

	public double getSalary() {
		return salary;
	}
	public void goingToVacation(){
	}
	public boolean getHiredOrFired() {
		return false;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Date getVacationDate() {
		return vacationDate;
	}


	public void setVacationDate(Date vacationDate) {
		this.vacationDate = vacationDate;
	}


}
