public class Student extends Person {
	private String sNumber;
	private int noOfCourses;
	private Course[] courses;

	public Student (String sNumber, String firstName, String lastName) {
		super(firstName, lastName);
		this.sNumber = sNumber;
		noOfCourses = 0;
		courses = new Course[7];
	}

	// create a method to add a new course into the courses array
	public void addCourse (Course aCourse) {
		courses[noOfCourses++] = aCourse;
	}

	public String toString () {
		String info = sNumber + " " + super.toString();
		for (int i = 0; i < noOfCourses; i++) {
			info += courses[i];
		}
		return info;
	}
}
