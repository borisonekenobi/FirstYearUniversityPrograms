public class Rank {
	private double mark; // Define a variable to store the student's mark

	public Rank (double mark) {
		this.mark = mark; // Initialize the mark variable
	}

	// Get the rank for the student
	public String getRank () {
		// Logic for what rank the student gets based on their mark
		if (mark < 50) {
			return "Unacceptable";
		} else {
			if (mark < 70) {
				return "Below Expectations";
			} else {
				if (mark < 90) {
					return "Meets Expectations";
				}
			}
		}
		return "Exceeds Expectations";
	}
}
