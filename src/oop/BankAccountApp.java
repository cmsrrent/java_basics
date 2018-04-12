package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create new bank account

		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "012345";		
		acc1.balance = 1000;
		acc1.setName("Rob Test");
		System.out.println(acc1.getName());
		acc1.setSsn("23459");
		System.out.println(acc1.getSsn());
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
				
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		
		BankAccount acc3 = new BankAccount("Checking Account", 400);
		acc3.accountNumber = "0123456";
		acc3.checkBalance();
		
		/*
		
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = 4.5;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}
