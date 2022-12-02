import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	public static void main (String[] args) throws FileNotFoundException {
		// create an object of type File
		File inputFile = new File("students.txt");
		// create a scanner object that read from text file
		Scanner scanner = new Scanner(inputFile);
		scanner.nextLine();
		String tempSN = null;

		while (scanner.hasNext()) {
			String sNumber = scanner.next();
			String sFirstName = scanner.next();
			String sLastName = scanner.next();
			String cCode = scanner.next();
			String cNumber = scanner.next();
			String cName = scanner.nextLine();

			// check if we read the same student or not
			if (sNumber.equals(tempSN)) {
				System.out.println("          " + cName);
			} else {
				System.out.println(sNumber + " " + cName);
			}
			tempSN = sNumber;
				System.out.println();
		}
	}
}
