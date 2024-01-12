package oop;

import java.util.Date;

public class Dean extends Employee{
	private boolean goodMood;
	public Dean(String name, String surname,double salary,Date vacationDate,int experience) {
		super();
	}
	 public boolean isGoodMood() {
		 return goodMood;
	 }
	 public void setGoodMood(boolean goodMood) {
		 this.goodMood = goodMood;
	 }
	 public boolean approveRequest(RequestMessage request) {
		 if (goodMood) {
			 request.setApproved(true);
			 return true;
			 
		 } else {
			 request.setApproved(false);
			 return false;

		 }
	 }

}


