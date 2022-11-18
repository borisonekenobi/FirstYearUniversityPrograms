import java.io.FileWriter;
import java.io.IOException;

public class FileSave {
	private String fileName; // String variable that will store the name of the file

	public FileSave(String fileName) { // constructor with parameter of a String variable fileName
		this.fileName = fileName; // save the provided String variable as into this.fileName
	}

	public void save(String line) throws IOException { // will save the provided String to the file (throws FileNotFoundException)
		FileWriter fileWriter = new FileWriter(fileName, true); // create a FileWriter object (the "true" allows you to append to end of file rather than recreating a file and writing to it)
		fileWriter.append(line); // add the provided String to the end of the file
		fileWriter.close(); // close the file
	}
}
