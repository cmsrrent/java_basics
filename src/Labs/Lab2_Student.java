package Labs;

public class Lab2_Student {

	public static void main(String[] args) {
		Student stu1 = new Student("Tom", "99887766");
		stu1.setPhone("07777777777");
		stu1.setCity("Liverpool");
		stu1.setState("Merseyside");
		
		stu1.enroll("Spanish");
		stu1.enroll("German");
		stu1.enroll("Computer Science");
		
		stu1.checkBalance();
		stu1.pay(2500);
		System.out.println(stu1.toString());
	}

}
	
class Student {

	private String name;
	private String SSN;
	private String email;
	private static int iD = 1000;
	private String userId;
	private String phone;
	private String city;
	private String state;
	private boolean enroll;
	private double balance;
	private String courses = "";
	
	
	//Constructor
	public Student(String name, String SSN) {				
		this.SSN = SSN;
		this.name = name;
		iD++;
		generateUserId();
		generateEmail();		
	}
	
	private void generateUserId() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max-min));
		random = random + min;
		System.out.println("Random num " + random);
		userId = iD + "" + random + SSN.substring(0, 4);
		System.out.println("Your User ID " + userId);
	}
	
	private void generateEmail() {
		email = name.toLowerCase() + "." + iD + "@mailinator.com";
		System.out.println("Your email is " + email);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + course + "\n";
		enroll = true;
		balance = balance + 3000;
	}
	
	public void pay(double amount) {
		balance = balance-amount;
		System.out.println("Paying bill " + amount);
		checkBalance();
	}
	
	
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public String showCourses() {
		return courses;
	}


	// Set and Get Phone no
	public void setPhone(String phone) {
		this.phone = phone;		
	}
	
	public String getPhone() {
		return(phone);		
	}
	
	// Set and Get City
	public void setCity(String city) {
		this.city = city;		
	}
	
	public String getCity() {
		return(city);		
	}
	
	//Set and Get State
	public void setState(String state) {
		this.state = state;		
	}
	
	public String getState() {
		return(state);		
	}
	
	public String toString() {
		return "[Name: " + name + " ]\n[User ID: " + userId + "]\n[Email: " + email + "]\n" + "[City: " + city + "]\n" + "[Courses: " + courses + "]";
	}
			
}
	

