package Interfaces;

public class FinalExam3 extends GradedActivity implements Relatable {
	private int numQuestions; // Number of questions
	private double pointsEach; // Points for each question
	private int numMissed; // Questions missed

	public FinalExam3 (int questions, int missed) {
		double numericScore; // To hold a numeric score
		numQuestions = questions;
		numMissed = missed;
		pointsEach = 100.0 / questions;
		numericScore = 100.0 - (missed * pointsEach);
		setScore(numericScore);
	}

	public double getPointsEach () {
		return pointsEach;
	}

	public int getNumMissed () {
		return numMissed;
	}

	public boolean equals (GradedActivity g) {
		boolean status;
		if (this.getScore() == g.getScore())
			status = true;
		else
			status = false;
		return status;
	}

	public boolean isGreater (GradedActivity g) {
		boolean status;
		if (this.getScore() > g.getScore())
			status = true;
		else
			status = false;
		return status;
	}

	public boolean isLess (GradedActivity g) {
		boolean status;
		if (this.getScore() < g.getScore())
			status = true;
		else
			status = false;
		return status;
	}
}