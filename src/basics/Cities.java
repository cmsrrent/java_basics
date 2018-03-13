package basics;

public class Cities {

	public static void main(String[] args) {
		
		// Declare and define an array with implicite size
		String[] cities = {"New York", "San Francisco", "London", "Liverpool"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		

		
		// declare array
		String[] countries;
		
		// define array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Russia";
		countries[2] = "UK";
		System.out.println(countries[1]);
	
		System.out.println("****************");
		
		// Declare the array
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "NewJersey";
		states[3] = "Texas";
		states[4] = "Utah";		
		int i = 0;
		
		// Do Loop: enters loop then tests
		do {
			System.out.println("STATE at i :" + states[i]);
			i++;
		} while (i < 5);
		
		int n = 0;
		boolean stateFound = false;	
		while(!stateFound) {
			String state = states[n];
			System.out.println("Current state = " + state);
			if (state == "Texas") {
				System.out.println("STATE " + state + " found");
				stateFound = true;
			}			
			n++;
		}
		
		System.out.println("\n****************");
		System.out.println("\nPrinting for loop\n");
		// for loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
	}

}
