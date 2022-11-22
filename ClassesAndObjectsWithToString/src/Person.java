public class Person {
	//Define the class variables
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String emailAddress;
	private Address personAddress;

	private int noOfCars;
	private Car[] cars;

	public Person () {
		noOfCars = 0;
		cars = new Car[10]; // Assuming that the maximum allowed cars is 10
	}

	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}

	public void setLastName (String lName) {
		lastName = lName;
	}

	public void setEmailAddress (String email) {
		emailAddress = email;
	}

	public void setYearOfBirth (int yBirth) {
		yearOfBirth = yBirth;
	}

	//These are the class getter methods (accessors)
	public String getFirstName () {
		return firstName;
	}

	public String getLastName () {
		return lastName;
	}

	public String getEmailAddress () {
		return emailAddress;
	}

	public int getYearOfBirth () {
		return yearOfBirth;
	}

	public String getFullName () {
		return lastName + ", " + firstName;
	}

	public int getAge () {
		return 2022 - yearOfBirth;
	}

	public void setPersonAddress (Address personAddress) {
		this.personAddress = personAddress;
	}

	public void addCar (Car aCar) {
		if (noOfCars > 10) return;
		cars[noOfCars++] = aCar;
	}

	public String getAgeStage () {
		if (getAge() <= 1) return "Infant";
		else if (getAge() <= 4) return "Toddler";
		else if (getAge() <= 12) return "Child";
		else if (getAge() <= 19) return "Teen";
		else if (getAge() <= 39) return "Adult";
		else if (getAge() <= 59) return "Middle Age Adult";
		else return "Senior Adult";
	}

	public String about () {
		return String.format("%20s %s\n%20s %s\n%20s %d", "Full Name:", getFullName(), "Email Address:", emailAddress, "Age:", getAge());
	}

	public String toString () {
		String info = String.format("%20s %s\n%20s %s\n%20s %d",
				"Full Name:", getFullName(),
				"Email Address:", emailAddress,
				"Age:", getAge()) +
				personAddress;
		info += "\nCars information\n";
		info += "================\n";
		for (int i = 0; i < noOfCars; i++) {
			info += "Car " + (i + 1) + cars[i];
		}
		return info.toString();
	}

	public boolean equals (Person obj) {
		return this.yearOfBirth == obj.getYearOfBirth();
	}
}
