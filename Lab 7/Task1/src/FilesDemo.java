import java.io.IOException;

public class FilesDemo {
	public static void main (String[] args) throws IOException { // main method that can throw a FileNotFoundException
		String fileName = "lines.txt"; // String variable that stores the name of the file

		FileSave fileSave = new FileSave(fileName); // FileSave variable that will create the file
		fileSave.save("1-Lorem ipsum dolor sit amet"); // save string to the file
		fileSave.save("2-Consectetuer adipiscing elit"); // save string to the file
		fileSave.save("3-Sed diam nonummy nibh euismod tincidunt"); // save string to the file
		fileSave.save("4-Ut wisi enim ad minim veniam"); // save string to the file
		fileSave.save("5-Quis nostrud exerci tation ullamcorper"); // save string to the file
		fileSave.save("6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat"); // save string to the file
		fileSave.save("7-Duis autem vel eum iriure dolor in hendrerit"); // save string to the file
		fileSave.save("8-Vel illum dolore eu feugiat nulla facilisis at vero eros"); // save string to the file

		FileDisplay fileDisplay = new FileDisplay(fileName); // FileDisplay variable that will display the variable
		fileDisplay.display(); // display the entire file
		fileDisplay.display(3); // display the first 3 lines of the file
		fileDisplay.display(10); // display the first 10 lines of the file
		fileDisplay.display(3, 5); // display lines 3 to 5 of the file
	}
}
