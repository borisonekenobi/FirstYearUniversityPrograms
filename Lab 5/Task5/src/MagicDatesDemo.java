import java.util.Scanner;

public class MagicDatesDemo {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a new Scanner object

		System.out.print("Enter the month as a number (6): "); // Prompt user for the month
		int month = scanner.nextInt(); // Save the user input into the variable month

		System.out.print("Enter the day (10): "); // Prompt user for the day
		int day = scanner.nextInt(); // Save the user input into the variable day

		System.out.print("Enter the last 2 digits of the year (60): "); // Prompt the user for the year
		int year = scanner.nextInt(); // Save the user input into the variable year

		MagicDate magicDate = new MagicDate(month, day, year); // Create a new MagicDate object
		// Logic for whether the entered date is magic or not
		if (magicDate.isMagic()) System.out.println("The date you entered is magic");
		else System.out.println("The date you entered is not magic");
	}
}
