package basics;

public class Weather {

	public static void main(String[] args) {
		// Give suggestions of what to wear based on the weather
		
		int temperature = 65;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("Its nice, go for a t shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("Its a bit iffy, long shirt and jeans");
			System.out.println("Wear a hat, its sunny");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("Its cool, wear warm clothes");
		}
		else {
			System.out.println("Cold, wrap up well");
		}

	}

}

