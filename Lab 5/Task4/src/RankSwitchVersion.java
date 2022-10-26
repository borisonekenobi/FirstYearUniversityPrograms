public class RankSwitchVersion {
	private double mark; // Define a variable to store the student's mark

	public RankSwitchVersion(double mark) {
		this.mark = mark; // Initialize the mark variable
	}

	// Get the rank for the student
	public String getRank() {
		// Logic for what rank the student gets based on their mark
		return switch ((int) mark / 10) {
			case 10, 9 -> "Exceeds Expectations";
			case 8, 7 -> "Meets Expectations";
			case 6, 5 -> "Below Expectations";
			default -> "Unacceptable";
		};
	}
}
