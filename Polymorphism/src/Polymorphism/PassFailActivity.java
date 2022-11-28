package Polymorphism;

import Inheritance.GradedActivity;

// This class holds a numeric score and determines whether it is passing or failing.
public class PassFailActivity extends GradedActivity {
	private double minPassingScore; // Minimum passing score

	public PassFailActivity (double mps) {
		minPassingScore = mps;
	}

	/**
	 * The getGrade method returns a letter grade determined from the score field.
	 * This method overrides the getGrade method in the superclass.
	 */
	@Override
	public char getGrade () {
		char letterGrade; // To hold the letter grade
		if (getScore() >= minPassingScore) letterGrade = 'P';
		else letterGrade = 'F';
		return letterGrade;
	}
}
