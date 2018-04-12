package Labs;

public class Lab1_Q1 {

	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println("Sum of n (" + n + ") is " + getN(n));
	}

	public static int getN(int n) {
		
		int y = 0;
		
		for (int x = 1; x <= n; x++) {
			y = y + x; 
		}
		
		return y;
	}
	
}
