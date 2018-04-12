package oop;

public class BankAccount implements IRate {

	// define variables
	String accountNumber;
	
	// static >> belongs to class not the object instance
	// final >> constant often static final
	private static final String routingNumber = "01234";
	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions, unique methods
		// 1. Define or setup initialise properties of an object
		// 2. Constructors are IMPLICITY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have no return type
	
	BankAccount() {
		System.out.println("New account created");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT " + accountType);
	}

	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, msg are all local variables
		
		System.out.println("NEW ACCOUNT " + accountType);
		System.out.println("Initial deposit of " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error - min deposit of £1000";						
		} else {
			Msg = "Thanks for your despoit of " + initDeposit;			
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters and Setters
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Interface methods
	public void setRate() {
		System.out.println("setting rate");
	}

	public void increaseRate() {
		System.out.println("increasing rate");
	}
	
	// Methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private: can only be called rom within the class
	private void showActivity(String activity) {
		System.out.println("Your recent dransaction.. " + activity);
		System.out.println("Your balance is.. " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ", ACCOUNT# " + accountNumber + ", ROUTING# " + routingNumber + ", BALANCE £" + balance + " ]";
	}
	
	
}
