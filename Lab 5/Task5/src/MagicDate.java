public class MagicDate {
	private int month; // Define a variable to store the month
	private int day; // Define a variable to store the day
	private int year; // define a variable to store the year

	public MagicDate(int m, int d, int y) {
		month = m; // Initialize the month variable
		day = d; // Initialize the day variable
		year = y; // Initialize the year variable
	}

	public boolean isMagic() {
		return month * day == year; // Logic for whether the date entered is magic or not
	}
}
