package package1;

public class Message {
	private String toWhom;
	private String fromWhom;
	private String mainText;
	
	public String getToWhom() {
		return toWhom;
	}
	public void setToWhom(String toWhom) {
		this.toWhom = toWhom;
	}
	public String getFromWhom() {
		return fromWhom;
	}
	public void setFromWhom(String fromWhom) {
		this.fromWhom = fromWhom;
	}
	public String getMainText() {
		return mainText;
	}
	public void setMainText(String mainText) {
		this.mainText = mainText;
	}
	public String toString() {//user,student->name? whose name
		return "от: "+fromWhom+" кому: "+toWhom+'\n'+mainText;
	}
}
