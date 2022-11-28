package Abstract;

// This program demonstrates the Abstract.CompSciStudent class.
public class CompSciStudentDemo1 {
	public static void main (String[] args) {
		// Create a Abstract.CompSciStudent object.
		CompSciStudent csStudent = new CompSciStudent("Jennifer Haynes", "167W98337", 2018);
		// Store values for math, CS, and General Ed hours.
		csStudent.setMathHours(12);
		csStudent.setCsHours(20);
		csStudent.setGenEdHours(40);
		// Display the student's data.
		System.out.println(csStudent);
		// Display the number of remaining hours.
		System.out.println("Hours remaining: " + csStudent.getRemainingHours());
	}
}