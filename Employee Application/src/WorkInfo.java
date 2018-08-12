import java.util.Random;
import java.util.Scanner;

public class WorkInfo {
	private String user;
	private String department;
	private String password;
	private double mailCapacity;
	private String altEmail;
	private int passLength = 10;
	

	public static void main(String[] args) {		// TODO Auto-generated method stub
		// Generate an email for each user
		Scanner sc = new Scanner(System.in);
		System.out.println("Please print your name:");
		String user = sc.nextLine(); 
		System.out.println("Please state what department you are in");
		String department = sc.nextLine();
		System.out.println("How much mail do you plan to receive?");
		double mailCapacity = sc.nextDouble();
		int len = 10;

		System.out.println("Your name is " + user);
		System.out.println("Your department is " + department);
		System.out.print("Your mail capacity will be " + mailCapacity);
		System.out.println("\nYour password is " + passGenerator(len));

	}
	
	
static char[] passGenerator(int len) {
		
		String pass = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		char[] passGenerator = new char[len];
		for(int i = 0; i < len; i++) {
			passGenerator[i] = pass.charAt(random.nextInt(pass.length()));
		}
		return passGenerator;
	}
	
	
	
	// Change the password
	private void setPassword(String password) {
		this.password = password;
	}
	
	// Set the mailbox capacity
	private void setMailboxCapacity(double mailCapacity) {
		this.mailCapacity = mailCapacity;
	}
	
    // Define an alternate email address
	private void setAltEmail(String altEmail) {
    		this.altEmail = altEmail;
    }
    
    // Generate a random String for a password
	private String getPassword() {
		return password;
		
	}
	
	// Display mailbox capacity
	private double getMailboxCapacity() {
		return mailCapacity;
		
	}
	
	// Display alternate email
	private String getAltEmail() {
		return altEmail;
		
	}
	

}
