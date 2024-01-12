package oop;


public class Messages {
	
	private User toWhom;
	private User fromWhom;
	private String mainText;
	
	public User getToWhom() {
		return toWhom;
	}
	public void setToWhom(User user) {
		this.toWhom = toWhom;
	}
	
	public User getFromWhom() {
		return fromWhom;
	}
	public void setFromWhom(User user) {
		this.fromWhom = fromWhom;
	}
	public String getMainText() {
		return mainText;
	}
	public void setMainText(String mainText) {
		this.mainText = mainText;
	}
	
	public String toString() {//user,student->name? whose name
		return "от: "+fromWhom.getName()+" кому: "+toWhom.getName()+'\n'+mainText;
	}
}



