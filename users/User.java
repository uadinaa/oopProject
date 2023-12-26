package users;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private String surname;
//	private int id;
	public User() {}
	
	public User(String name) {
		this.name = name;
	}
	public User(String name,String surname) {
		this.setName(name);
//		this.id=id;
		this.setSurname(surname);
		//востановление пароля
		
	}
	
	public boolean login() {
		return false;
	}
	public void seeUniNews() {	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurName(String name) {
		this.surname = surname;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}


	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String toString() {
		return "name "+name+", "+"surname "+surname;
	}
}
