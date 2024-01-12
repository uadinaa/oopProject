package oop;

import java.util.HashMap;
import java.util.Vector;

import Researcher.Researcher;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private String surname;
	
	private String email;
	private String password;
	public User() {}
	
	public User(String name,String surname) {
		this.setName(name);
		this.setSurname(surname);
		
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
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String toString() {
		return "name "+name+", "+"surname "+surname;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public boolean login(String enteredUsername, String enteredPassword) {
		// TODO Auto-generated method stub
		return false;
	}
}
