import java.util.Scanner;

public class SumA2B {
	public static void main (String[] args) { // main method
		Scanner scanner = new Scanner(System.in); // defines a new Scanner object
		int a = scanner.nextInt(); // creates and initializes variable a to user input
		int b = scanner.nextInt(); // creates and initializes variable b to user input
		int sum = 0; // creates and initializes variable sum to 0
		for (; a <= b; a++) { // for loop that will continue looping until a is greater than b
			sum += a; // add a to sum
		}
		System.out.println(sum); // print sum
	}
}
