package Abstract;

/**
 * The Abstract.Student class is an abstract class that holds general
 * data about a student. Classes representing specific types
 * of students should inherit from this class.
 */
public abstract class Student {
	private String name; // Abstract.Student name
	private String idNumber; // Abstract.Student ID
	private int yearAdmitted; // Year student was admitted
	// The Constructor accepts as arguments the student’s
	// name, ID number, and the year admitted.
	public Student(String n, String id, int year) {
		name = n;
		idNumber = id;
		yearAdmitted = year;
	}
	public String toString() {
		return "Name: " + name + "\nID Number: " + idNumber +
				"\nYear Admitted: " + yearAdmitted;
	}
	// The getRemainingHours method is abstract. It must be overridden in a subclass.
	public abstract int getRemainingHours();
}
