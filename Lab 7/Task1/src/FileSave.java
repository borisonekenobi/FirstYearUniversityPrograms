import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileSave {
	private String fileName; // String variable that will store the name of the file

	public FileSave(String fileName) { // constructor with parameter of a String variable fileName
		this.fileName = fileName; // save the provided String variable as into this.fileName
	}

	public void save(String line) throws FileNotFoundException { // will save the provided String to the file (throws FileNotFoundException)
		PrintWriter printWriter = new PrintWriter(fileName); // create a PrintWriter object
		printWriter.append(line); // add the provided String to the end of the file
		printWriter.close(); // close the file
	}
}
