import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
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
                System.out.println( "          " + cName);
            } else {
                System.out.println(currentStudentNumber + " " + cName);
            }
            previousStudentNumber = currentStudentNumber;
        }
    }
}
