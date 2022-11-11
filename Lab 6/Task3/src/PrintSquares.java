import java.util.Scanner;

public class PrintSquares {
	public static void main (String[] args) { // main method
		Scanner scanner = new Scanner(System.in); // defines a new Scanner object
		System.out.print("Enter a positive nonzero integer value: "); // asks user for a positive nonzero integer value
		int N = scanner.nextInt(); // creates and initializes the variable N to the user input
		int i = 1; // creates and initializes the variable i as a loop-counter to 1
		StringBuilder output = new StringBuilder(); // creates and initializes the variable output as an empty string
		while (i * i <= N) { // while loop that will continue looping until i² is greater than N
			if (i != 1) output.append(", "); // append ", " to the output
			output.append(i * i); // append i² to the output
			i++; // increases i by 1
		}
		System.out.println(output + "."); // print the output with a "." at the end
	}
}
