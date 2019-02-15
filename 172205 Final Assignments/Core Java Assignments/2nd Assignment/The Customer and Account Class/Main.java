package com.customer_account;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer(101,"rishi",70);
		Account a = new Account(101,c,10000);
		
		System.out.println(c.toString());
        System.out.println(a.toString());
        a.deposit(1000);
        a.Withdraw(5000);
	}

}
