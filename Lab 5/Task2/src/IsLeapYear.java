import java.util.Scanner;

public class IsLeapYear {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a new Scanner object

		System.out.print("Enter a year: "); // Prompt user for a year
		int year = scanner.nextInt(); // Store the user input into the year variable

		// Logic for whether year is a leap year or not
		if (year % 400 == 0) System.out.println("A LEAP YEAR");
		else if (year % 100 == 0) System.out.println("NOT A LEAP YEAR");
		else if (year % 4 == 0) System.out.println("A LEAP YEAR");
		else System.out.println("NOT A LEAP YEAR");
	}
}
