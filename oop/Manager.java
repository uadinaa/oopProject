package oop;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee{
	
	public Manager() {}
	
	public Manager(String name, String surname, int id, String password, String email,int salary, Date vacationDate, int experience) {
    	super(name,surname,id,password,email, salary,vacationDate, experience);
    }
	
	public void manageNews() {
		
	}
	
	public void viewInfoAbStudentsAndTeachers() {
		
	}
	
	public void addNews(News newsModel) {
        // Implementation of the addNews method goes here
    }

}
