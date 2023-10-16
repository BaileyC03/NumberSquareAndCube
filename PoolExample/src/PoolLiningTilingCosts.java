import java.util.Scanner;
public class PoolLiningTilingCosts {	
	public static void main(String[] args) {
	
	// Taking user input
	System.out.println("Please enter a subject number to find the square and"
			+ "cubed versions of it");
	Scanner scan = new Scanner(System.in);
	int userNumber = scan.nextInt();
	
	// Doing calculations
	int squaredNumber = (userNumber*userNumber);
	int cubedNumber = (userNumber*userNumber*userNumber);
	
	// Formatting and printing outputs
	String output = String.format("Your squared number is %d. %n Your cubed number is %d.",
			squaredNumber, cubedNumber);
	System.out.println(output);
	scan.close();
	
		
	}
}