package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("013902310", 1000);		
		BankAccount acc2 = new BankAccount("023902311", 2000);
		BankAccount acc3 = new BankAccount("033902312", 3000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toSting());
	}

}


class BankAccount implements iInterest {
	
	//Properties of bank account
	private static int iD = 1000;	// Internal ID
	private String accountNumber; 	// iD + random 2 digit + first 2 of SSN
	private static final String routingNumber = "00540067";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {		
		balance = initDeposit;
		this.SSN = SSN;
		iD++;		
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		System.out.println(random);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public String getName() {
		return(name);		
	}

	
	public void payBill(double amount) {
		balance = balance-amount;
		System.out.println("Paying bill " + amount);
		showBalance();
	}

	public void makeDeposit(double amount) {
		System.out.println("Making deposit " + amount);
		balance = balance+amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	public String toSting() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
	
	
}