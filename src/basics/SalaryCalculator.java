package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
			
		// using variables
		
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";		
		System.out.println("My career is: " + career);
		
		// Declare & define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary is £" + salary);
	
	}
	
}
