import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KidsPopularName {
	private String[] kidsNames; // String array to store the kid names
	private String fileName; // String to store the file name

	public KidsPopularName (String fileName) throws FileNotFoundException { // constructor with parameter for a String (throws FileNotFoundException)
		this.fileName = fileName; // sets fileName to the provided String
		kidsNames = new String[getNumNames()]; // create a String array with size of getNumNames()
		fillNames(); // fills the array
	}

	private int getNumNames () throws FileNotFoundException { // will return the number of lines in the file (throws FileNotFoundException)
		int count = 0; // int variable to store the count of the lines
		File file = new File(fileName); // creates a File object
		Scanner scanner = new Scanner(file); // creates a Scanner object
		while (scanner.hasNext()) { // loop until the end of the file
			scanner.nextLine(); // go to the next line
			count++; // increase count by 1
		}
		return count; // return count
	}

	private void fillNames () throws FileNotFoundException { // will fill the array with the names from the file (throws FileNotFoundException)
		File file = new File(fileName); // create a File object
		Scanner scanner = new Scanner(file); // create a Scanner object
		for (int i = 0; i < kidsNames.length; i++) { // loop through the indexes of the kidsNames array
			kidsNames[i] = scanner.nextLine(); // set the current index to the next line of the file
		}
	}

	public boolean isPopularName (String name) { // will return whether the provided String is in the array with the parameter for a String
		for (String kidsName : kidsNames) { // loop through all values of the array
			if (kidsName.equalsIgnoreCase(name)) return true; // check if the current value is equal (while ignoring case) to the provided String
		}
		return false; // return false
	}
}
