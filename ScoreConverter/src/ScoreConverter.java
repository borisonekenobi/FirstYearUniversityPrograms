public class ScoreConverter {
	private double score;

	// Set the value for the score

	public void setScore (double score) {
		this.score = score;
	}

	public char getGrade() {
		char grade; // local variable
		if (score < 50)
			grade = 'F';
		else if (score < 60)
			grade = 'D';
		else if (score < 70)
			grade = 'C';
		else if (score < 80)
			grade = 'B';
		else
			grade = 'A';

		return grade;
	}
}
