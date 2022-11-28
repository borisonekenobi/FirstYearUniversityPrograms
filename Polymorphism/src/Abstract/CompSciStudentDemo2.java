package Abstract;

// This program demonstrates the Abstract.CompSciStudent class.
public class CompSciStudentDemo2 {
	public static void main (String[] args) {
		// Create a Abstract.CompSciStudent object.
		Student csStudent = new CompSciStudent("Jennifer Haynes", "167W98337", 2018, 12, 20, 40);
		// Display the student's data.
		System.out.println(csStudent);
		// Display the number of remaining hours.
		System.out.println("Hours remaining: " + csStudent.getRemainingHours());
	}
}
