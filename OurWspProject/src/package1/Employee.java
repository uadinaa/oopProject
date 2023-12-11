package package1;

import java.util.Date;

public class Employee extends User {
	private double salary;
	private Date vacationDate;
	private int experience;
	

	public Employee(String name, int id, String password, String email,double salary,Date vacationDate,int experience) {
		super(name, id, password, email);
		this.setSalary(salary);
		this.vacationDate=vacationDate;
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


}
