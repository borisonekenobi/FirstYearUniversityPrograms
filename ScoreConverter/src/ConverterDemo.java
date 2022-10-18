import java.util.Scanner;

public class ConverterDemo {
	public static void main (String[] args) {
		double score;
		char grade;

		// create the score converted object
		ScoreConverterWithSwitch converter = new ScoreConverterWithSwitch();

		// create the scanner object
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user to enter the score
		System.out.print("Enter the value of the score: ");
		score = keyboard.nextDouble();

		// Set the score value for the converter object
		converter.setScore(score);

		// convert the given score
		grade = converter.getGrade();

		System.out.println("The score " + score + " is equivalent to the grade " + grade);
	}
}
