package package1;

public class User {
	private String name;
	private int id;
	private String password;
	private String email;
	public User(String name,int id,String password,String email) {
		this.setName(name);
		this.setId(id);
		this.setPassword(password);
		this.setEmail(email);
		
	}
	public boolean login() {
		return false;
	}
	public void seeUniNews() {	
	}
	
	public Journal Obervable subscribeToJournal(User user) {
		return 0;
	}
	
	private Languages selectedLanguage;
	public void chooseLanguage(Languages language) {
        this.selectedLanguage = language;
        System.out.println("Selected language: " + language);
     }
	
		

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	public String toString() {
		return "";
	}
	
	
	

}
