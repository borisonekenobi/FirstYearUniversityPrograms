/**
 * Q1.
 * (10 marks) The given Java program below prompts the user to enter an integer number between 1 to
 * 999 (inclusive), and then save it in an integer variable named number. Complete this program in the
 * given space such that the program adds all the digits in this number, and then display the result using
 * println method. For example, if the number is 392, the sum of all its digits is 14. It is not allowed
 * to use if or switch statements, or to convert the number into string. Remember to add comments
 * in your program to make it more readable. Hint: Use the integer division and modulus operators.
 *
 * Here is a sample run (1):
 * Enter any number that is greater than 0 and less than 100: 999
 * The sum of the digits is 27
 *
 * Sample run (2):
 * Enter any number that is greater than 0 and less than 100: 26
 * The sum of the digits is 8
 *
 * Sample run (3):
 * Enter any number that is greater than 0 and less than 100: 5
 * The sum of the digits is 5
 */

import java.util.Scanner;
public class SumDigits {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number that is greater than 0 and less than 100: ");
//		int number = input.nextInt();
//		int left = number / 100;
//		int mid = number / 10 % 10;
//		int right = number % 10;
//		System.out.println("The sum of the digits is " + (left + mid + right));
	}
}