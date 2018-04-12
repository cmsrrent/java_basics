package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("Book contains the word ring");
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser contains chrome");
		}
		
		String firstName = "Rob";
		String surName = "Renton";
		String SSN = "24298418525";
		
		System.out.println("There are " + SSN.length() + " digits in SSN");
		
		// Print the initials plus last 4 digits of SSN		
		System.out.println(firstName.substring(0,2));
		System.out.println(surName.substring(0,2));
		System.out.println(SSN.substring(7));
		
		
	}

}
