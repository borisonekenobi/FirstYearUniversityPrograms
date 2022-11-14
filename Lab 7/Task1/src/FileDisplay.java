import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDisplay {
	private String fileName; // String variable that will store the name of the file

	public FileDisplay(String fileName) { // constructor with parameter of a String variable fileName
		this.fileName = fileName; // save the provided String variable as into this.fileName
	}

	public void display() throws FileNotFoundException { // will display the entire file (throws FileNotFoundException)
		File file = new File(fileName); // create a File object
		if (!file.exists()) { // check if the file exists
			System.out.println("The file does not exists"); // print that the file does not exist
			return; // exit the method
		}
		Scanner scanner = new Scanner(file); // create a Scanner object
		while (scanner.hasNext()) { // loop until end of file
			System.out.println(scanner.nextLine()); // print the current line
		}
	}

	public void display(int n) throws FileNotFoundException { // will display file until line n (throws FileNotFoundException)
		File file = new File(fileName); // create a File object
		if (!file.exists()) { // check if file exists
			System.out.println("The file does not exists"); // print that the file does not exist
			return; // exit the method
		}
		Scanner scanner = new Scanner(file); // create a Scanner object
		while (scanner.hasNext() && n > 0) { // loop until end of file or have reached the specified line number
			System.out.println(scanner.nextLine()); // print the current line
			n--; // decrease number of lines left to print
		}
	}

	public void display(int from, int to) throws FileNotFoundException {// will display file from the provided line to the provided line (throws FileNotFoundException)
		File file = new File(fileName); // create a File object
		if (!file.exists()) { // check if file exists
			System.out.println("The file does not exists"); // print that the file does not exist
			return; // exit the method
		}
		Scanner scanner = new Scanner(file); // create a Scanner object
		int currentLine = 1; // int variable to store the current line number
		while (scanner.hasNext() && currentLine <= to) { // loop until end of file or have reached the specified ending line number
			if (currentLine >= from) System.out.println(scanner.nextLine()); // print the current line if it is within the specified range
			else scanner.nextLine(); // otherwise move to the next line
			currentLine++; // increase currentLine variable
		}
	}
}
