package oop;

public class Accountant extends Employee{
	protected int budget;
	
	public Accountant() {
		
	}
	
	public Accountant( int budget) {
		this.budget = budget;
	}
	
	public int setSalary() {
		return 100000;
	}
	
	public int giveStipend() {
		//if grantnik, 41898
		return 20000;
	}
	
	public int collectPlatniksMoney() {
		//if StudentStatus == platnik and ordinal(enumnyn nomeryn ispolzuet)
		return 3456789;
	}
	
	public int giveSalary() {
		
		return 67697679;
	}
	
	

}
