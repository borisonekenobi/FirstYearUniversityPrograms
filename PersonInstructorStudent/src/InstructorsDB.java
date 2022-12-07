import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InstructorsDB {
    public static void main(String[] args) throws FileNotFoundException {
        // define an array to hold the students information
        Instructor[] instructorsArray = new Instructor[10]; // we assume that the maximum number of instructors is 10.
        int noOfInstructor = 0;
        // create an object of type File
        File inputFile = new File("instructors.txt");
        // create a scanner object that read from text file
        Scanner sc = new Scanner(inputFile);

        sc.nextLine(); // to skip the first line in the file

        while (sc.hasNext()) {
            String firstName = sc.next();
            String lastName = sc.next();
            String office = sc.next();
            String dept = sc.nextLine();

            // create a new instructor object

            instructorsArray[noOfInstructor++] = new Instructor(firstName, lastName, office, dept);
        }

        // let us now print out the instructors array elements
        for (int i = 0; i < noOfInstructor; i++) {
            System.out.println(instructorsArray[i]);
        }
    }
}

