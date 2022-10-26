import java.util.Scanner;

public class EvenOdd {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a new Scanner object

		System.out.print("Enter an integer number: "); // Prompt user for a number
		int number = scanner.nextInt(); // Store user input into number variable

		System.out.println(number % 2 == 0 ? "EVEN" : "ODD"); // Output whether number is even or odd
	}
}
