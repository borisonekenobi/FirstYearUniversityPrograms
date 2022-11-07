import java.util.Scanner;

public class FizzBuzz {
	public static void main (String[] args) { // main method
		Scanner scanner = new Scanner(System.in); // defines a new Scanner object
		int start = scanner.nextInt(); // creates and initializes start variable to user input
		int end = scanner.nextInt(); // creates and initializes end variable to user input
		for (; start <= end; start++) { // for loop that continues looping until start is greater than end
			String output = ""; // creates and initializes output variable to empty string ("")
			if (start % 3 == 0) output += "Fizz"; // if the current value of start is divisible by 3, add "Fizz" to output
			if (start % 5 == 0) output += "Buzz"; // if the current value of start is divisible by 5, add "Buzz" to output
			System.out.println(output.equals("") ? start : output); // print the current value if the output variable is still an empty string, otherwise print output
		}
	}
}
