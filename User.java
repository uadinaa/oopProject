package oop;

public class User {
	
	private String name;
	private String surname;
	private int id;
	private String password;
	private String email;
	
	public User() {}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public User(String name, String surname, int id, String password, String email) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.password = password;
		this.email = email;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
	
	public Boolean login() {
		return ;
	}
	
	public void seeUniNews() {
		
	}
	
	public String chooseLanguage() {
		return;
	}
	
	public String toString() {
		return name + " "+  surname+ " " + id + " " + password + " " + email + " " ;
	}

	
	
	
	
}
