public class Person {
	private String firstName;
	private String lastName;

	public Person (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String toString () {
		return String.format("%20s %30s\n", "Full name:", firstName + " " + lastName);
	}
}
