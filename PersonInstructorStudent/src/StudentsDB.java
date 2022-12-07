import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentsDB {
    public static void main(String[] args) throws FileNotFoundException {
        // define an array to hold the students information
        Student[] studentsArray = new Student[10]; // we assume that the maximum number of students is 10.
        int noOfStudents = -1;
        // create an object of type File
        File inputFile = new File("students.txt");
        // create a scanner object that read from text file
        Scanner sc = new Scanner(inputFile);
        sc.nextLine();
        String previousStudentNumber = null;

        while (sc.hasNext()) {
            String currentStudentNumber = sc.next();
            String sFirstName = sc.next();
            String sLastName = sc.next();
            String cCode = sc.next();
            String cNumber = sc.next();
            String cName = sc.nextLine();

            // check if we read the same student or not
            if (currentStudentNumber.equals(previousStudentNumber)) {
                // add the new course to the current student
                Course aCourse = new Course(cCode, cNumber, cName);
                studentsArray[noOfStudents].addCourse(aCourse);
            } else {
                // create a new student object
                Student st = new Student(sFirstName, sLastName, currentStudentNumber);
                // create a course object
                Course aCourse = new Course(cCode, cNumber, cName);
                st.addCourse(aCourse);
                studentsArray[++noOfStudents] = st;

            }
            previousStudentNumber = currentStudentNumber;
        }

        // let us now print out the students array elements
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println(studentsArray[i]);
        }

    }
}
