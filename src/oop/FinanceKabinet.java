package oop;

import java.io.Serializable;

public class FinanceKabinet implements Serializable {
	private int funds;
	
	public FinanceKabinet() {}
	public FinanceKabinet(int funds) {
		
		this.funds = funds;
	}
	
	public int getFunds() {
		return funds;
	}
	public void setFunds(int funds) {
		this.funds = funds;
	}
	
	
	public void removeFunds(int amount) {
		funds -= amount;
	}
	
	public void addFunds(int amount) {
        funds += amount;
    }
	
	public String toString() {
		return "Your balance = " + funds;
	}
}
