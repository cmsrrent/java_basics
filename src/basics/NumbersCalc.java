package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is starting.....");
		printName();
		int numA = 10;
		int numB = 30;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println(numA + " * " + numB + " = " + product);
		
	}

	// function with no args and no return
	static void printName() {
		System.out.println("Hi Im Rob");
	}
	
	// function accepting args with no return
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println(numberA + " + " + numberB + " = " + sum);
	}
	
	// function accepting args with return
	static int multiplyNumbers(int numberA, int numberB) {
		int product = numberA * numberB;
		addNumbers(product, product);
		return product;
	}
	
	
}
