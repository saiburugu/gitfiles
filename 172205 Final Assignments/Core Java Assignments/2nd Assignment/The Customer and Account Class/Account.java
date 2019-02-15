package com.customer_account;

public class Account {
	int ID;
	Customer customer;
	double Balance=0.0;
	double amount=5000;
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	/*public String getCustomerName()
	{
		return name;
	}*/
	
	void deposit(double amount)
	{
		System.out.println("Add amount to balance? Enter amount:");
		Balance=Balance+amount;
	}
	
	public double Withdraw(double amount)
	{
		System.out.println("Enter amount to withdraw");
		if(Balance>amount)
		{
		return Balance=Balance-amount;
		}
		else
		{
			System.out.println("amount requested exceeds current balance!");
		}
		return Balance;
	}
	Account(int ID,Customer customer,double Balance)
	{
		this.ID=ID;
		this.customer=customer;
		this.Balance=Balance;
		
	}
	
	Account(int ID,Customer customer)
	{
		
	}
	
	public String toString() {
		return "Account [ID=" + ID + ", customer=" + customer + "," + String.format("%.2f", Balance)+ "]";
	}	
	
}
