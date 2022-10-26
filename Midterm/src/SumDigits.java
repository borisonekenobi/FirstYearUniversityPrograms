import java.util.Scanner;

public class SumDigits {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int left = number / 100;
		int mid = number / 10 % 10;
		int right = number % 10;
		System.out.println("The sum of the digits is " + (left + mid + right));
	}
}
