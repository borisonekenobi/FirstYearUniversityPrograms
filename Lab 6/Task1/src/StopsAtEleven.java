import java.util.Scanner;

public class StopsAtEleven {
	public static void main (String[] args) { // main method
		Scanner scanner = new Scanner(System.in); // defines a new Scanner object
		int num = scanner.nextInt(); // creates and initializes num variable with user input
		int count = 0; // defines count variable with starting number 0
		while(num != 11) { // defines a while loop that continues looping unless num is equal to 11
			num = scanner.nextInt(); // gets user input and stores in num variable
			count++; // increases  count variable by 1
		}
		System.out.println(count); // prints count variable
	}
}
