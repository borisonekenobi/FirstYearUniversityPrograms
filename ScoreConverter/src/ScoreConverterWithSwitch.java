public class ScoreConverterWithSwitch {
	private double score;

	// Set the value for the score

	public void setScore (double score) {
		this.score = score;
	}

	public char getGrade() {
		char grade; // local variable
//		if (score < 50)
//			grade = 'F';
//		else if (score < 60)
//			grade = 'D';
//		else if (score < 70)
//			grade = 'C';
//		else if (score < 80)
//			grade = 'B';
//		else
//			grade = 'A';

		switch ((int) score/10) {
			case 6:
				grade = 'D';
				break;

			case 7:
				grade = 'C';
				break;

			case 8:
				grade = 'B';
				break;

			case 9:
			case 10:
				grade = 'A';
				break;

			default:
				grade = 'F';
		}

		return grade;
	}
}
