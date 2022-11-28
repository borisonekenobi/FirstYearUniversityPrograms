package Inheritance;

public class CurvedActivity extends GradedActivity {
	private double rawScore; // Unadjusted score
	private double percentage; // Curve percentage

	public CurvedActivity (double percent) {
		percentage = percent;
		rawScore = 0.0;
	}

	/* The setScore method overrides the superclass setScore method.This version accepts
	 * the unadjusted score as an argument.That score is multiplied by the curve percentage
	 * and the result is sent as an argument to the superclass's setScore method.
	 */
	@Override
	public void setScore (double s) {
		rawScore = s;
		super.setScore(rawScore * percentage);
	}

	public double getRawScore () {
		return rawScore;
	}

	public double getPercentage () {
		return percentage;
	}
}