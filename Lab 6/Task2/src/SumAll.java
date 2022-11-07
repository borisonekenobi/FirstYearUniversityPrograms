import java.util.Scanner;

public class SumAll {
	public static void main (String[] args) { // main method
		Scanner scanner = new Scanner(System.in); // defines a new Scanner object
		System.out.print("Enter a positive nonzero integer value: "); // asks user for a positive nonzero integer value
		int num = scanner.nextInt(); // creates and initializes variable num to the user input
		int i = 0; // creates and initializes a loop-counter variable to 0
		int sum = 0; // creates and initializes a sum variable to 0
		do { // do while loop
			i++; // increases the loop-counter variable by 1
			sum += i; // adds i to sum
		} while (i < num); // loop will loop until i is greater than or equal to num

		System.out.println(sum); // output the sum
	}
}
