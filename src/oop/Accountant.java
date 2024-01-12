package oop;

import java.io.Serializable;

public class Accountant extends Employee implements Serializable{
	protected int budget;
	
	public Accountant() {
		
	}
	
	public Accountant( int budget) {
		this.budget = budget;
	}
	
	public int setSalary(Employee e) {
		if(e instanceof Teacher) return 500000;
		else if(e instanceof Manager) return 450000;
		else if(e instanceof Admin) return 550000;
		else if(e instanceof TechSupport) return 200000; 
		else if(e instanceof DeanOffice) return 700000;
		else return 386000; //else case is accountant itself
		
	}
	
	public int giveStipend(Student student) {
		if(student.getStudentStatus() == StudentStatus.GRANTNIK) {
		int stipendAmount = 41898;
        
        FinanceKabinet financeKabinet = student.getFinanceKabinet();
        financeKabinet.addFunds(stipendAmount);
        budget -= stipendAmount;

        return stipendAmount;
        }
        
         else return 0 ;
        
	}
	
	public int collectPlatniksMoney(Student student) {
        if (student.getStudentStatus() == StudentStatus.PLATNIK) {
        	int costOfObuchenieForSemestr = 3500000;
            // Collect money from platnik students
        	FinanceKabinet financeKabinet = student.getFinanceKabinet();
            financeKabinet.removeFunds(costOfObuchenieForSemestr );
            budget += costOfObuchenieForSemestr;

            return costOfObuchenieForSemestr ;
        } else {
            
            return 0;
        }
    }
	
	 public void giveSalary(Employee employee) {
	        FinanceKabinet financeKabinet = employee.getFinanceKabinet();
	        
	        int salary = setSalary(employee);
	        
	        financeKabinet.addFunds(salary);
	    }

	public String toString() {
		return "University budget = " + budget;
	}
}