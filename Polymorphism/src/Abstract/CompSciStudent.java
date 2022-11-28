package Abstract;

public class CompSciStudent extends Student {
	// Constants for the math, computer science and
	// general education hours required for graduation.
	private final int MATH_HOURS = 20, CS_HOURS = 40, GEN_ED_HOURS = 60;
	// Math hours, Comp. sci. hours, and General ed hours taken
	private int mathHours, csHours, genEdHours;

	public CompSciStudent (String n, String id, int year) {
		super(n, id, year);
	}

	public CompSciStudent (String n, String id, int year, int math, int cs, int genEd) {
		super(n, id, year);
		setMathHours(math);
		setCsHours(cs);
		setGenEdHours(genEd);
	}

	public void setMathHours (int math) {
		mathHours = math;
	}

	public void setCsHours (int cs) {
		csHours = cs;
	}

	public void setGenEdHours (int genEd) {
		genEdHours = genEd;
	}

	public String toString () {
		return super.toString() + "\nMajor: Computer Science" +
				"\nMath Hours Taken: " + mathHours + "\nComputer Science Hours Taken: " +
				csHours + "\nGeneral Ed Hours Taken: " + genEdHours;
	}

	@Override
	public int getRemainingHours () {
		int reqHours, // Total required hours
				remainingHours; // Remaining hours
		// Calculate the total required hours.
		reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
		// Calculate the remaining hours.
		remainingHours = reqHours - (mathHours + csHours +
				genEdHours);
		// Return the remaining hours.
		return remainingHours;
	}
}
